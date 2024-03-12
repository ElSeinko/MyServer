package com.example.myserver;

import com.example.myserver.model.EntityAuftrag;
import com.example.myserver.model.EntityKunde;
import com.example.myserver.model.EntityMitarbeiter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.lang.reflect.Type;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/mitarbeiter")
public class MitarbeiterController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Gson gson = new Gson();
    @GET
    @Path("/getAll")
    public String getAll(){
        em.getTransaction().begin();
        refreshTable();
        List<EntityMitarbeiter> list = em.createQuery("Select k from EntityMitarbeiter k").getResultList();
        String listJson = gson.toJson(list);
        em.getTransaction().commit();
        return listJson;
    }

    @GET
    @Path("/loeschen/{id}")
    public void loeschen(@PathParam("id") int id) {
        em.getTransaction().begin();
        EntityMitarbeiter g = em.find(EntityMitarbeiter.class, id);
        em.remove(g);
        em.getTransaction().commit();
    }

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityMitarbeiter ek = gson.fromJson(jsonString, EntityMitarbeiter.class);
        em.getTransaction().begin();
        em.persist(ek);
        em.flush();
        em.getTransaction().commit();
        return "true";

    }

    @POST
    @Path("/aendern")
    @Consumes(MediaType.APPLICATION_JSON)
    public String aendern(String jsonString){
        Type mapType = new TypeToken<List<EntityMitarbeiter>>() {}.getType();
        List<EntityMitarbeiter> list = gson.fromJson(jsonString, mapType);


        em.getTransaction().begin();
        Query query = em.createQuery("update EntityMitarbeiter set vorname = :vorname, nachname = :nachname");
        for (int i = 0; i < list.size(); i++) {
            query.setParameter("vorname", list.get(i).getVorname());
            query.setParameter("nachname", list.get(i).getNachname());
            query.executeUpdate();
        }
        em.getTransaction().commit();
        return "true";

    }
    public void refreshTable(){
        List<EntityMitarbeiter> list = em.createQuery("Select k from EntityMitarbeiter k").getResultList();
        for (int i = 0; i < list.size()-1; i++){
            em.refresh(em.find(EntityMitarbeiter.class, list.get(i).getMitarbeiterid()));
        }
    }
}
