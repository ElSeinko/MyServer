package com.example.myserver;


import com.example.myserver.model.EntityAuftrag;
import com.example.myserver.model.EntityKunde;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/kunde")
public class KundeController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Gson gson = new Gson();
    @GET
    @Path("/getAll")
    public String getAll(){
        em.getTransaction().begin();
        refreshTable();
        List<EntityKunde> list = em.createQuery("Select k from EntityKunde k").getResultList();
        String listJson = gson.toJson(list);
        em.getTransaction().commit();
        return listJson;
    }

    @GET
    @Path("/loeschen/{id}")
    public void loeschen(@PathParam("id") int id) {
        em.getTransaction().begin();
        EntityKunde g = em.find(EntityKunde.class, id);
        em.remove(g);
        em.getTransaction().commit();
    }

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityKunde ek = gson.fromJson(jsonString, EntityKunde.class);
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
        Type mapType = new TypeToken<List<EntityKunde>>() {}.getType();
        List<EntityKunde> list = gson.fromJson(jsonString, mapType);


        em.getTransaction().begin();
        Query query = em.createQuery("update EntityKunde set vorname = :vorname, nachname = :nachname, postleitzahl = :plz, " +
                "ort = :ort, strasse = :str, hausnummer = :hsnr, tuer = :tuer, telnummer = :tnr where kundeid = :kundennr");
        for (int i = 0; i < list.size(); i++) {
            query.setParameter("vorname", list.get(i).getVorname());
            query.setParameter("nachname", list.get(i).getNachname());
            query.setParameter("plz", list.get(i).getPostleitzahl());
            query.setParameter("ort", list.get(i).getOrt());
            query.setParameter("str", list.get(i).getStrasse());
            query.setParameter("hsnr", list.get(i).getHausnummer());
            query.setParameter("tuer", list.get(i).getTuer());
            query.setParameter("tnr", list.get(i).getTelnummer());
            query.setParameter("kundennr", list.get(i).getKundeid());
            query.executeUpdate();
        }
        em.getTransaction().commit();
        return "true";

    }

    public void refreshTable(){
        List<EntityKunde> list = em.createQuery("Select k from EntityKunde k").getResultList();
        for (int i = 0; i < list.size()-1; i++){
            em.refresh(em.find(EntityKunde.class, list.get(i).getKundeid()));
        }
    }
}
