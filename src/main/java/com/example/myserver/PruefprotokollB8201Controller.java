package com.example.myserver;

import com.example.myserver.model.EntityFmgasbefund;
import com.example.myserver.model.EntityPruefprotokoll;
import com.example.myserver.model.EntityPruefprotokollb8201;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/pruefprotokollb8201")
public class PruefprotokollB8201Controller {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityPruefprotokollb8201 eg = gson.fromJson(jsonString, EntityPruefprotokollb8201.class);
        em.getTransaction().begin();
        em.persist(eg);
        em.flush();
        em.getTransaction().commit();
        return "true";
    }

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em.getTransaction().begin();
        em.refresh(em.find(EntityPruefprotokollb8201.class, id));
        EntityPruefprotokollb8201 eg = em.find(EntityPruefprotokollb8201.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityPruefprotokollb8201 e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityPruefprotokollb8201> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }
}
