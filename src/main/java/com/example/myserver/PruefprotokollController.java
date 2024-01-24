package com.example.myserver;

import com.example.myserver.model.EntityPruefprotokoll;
import com.example.myserver.model.EntityPruefprotokollb8201;
import com.google.gson.Gson;
import jakarta.persistence.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/pruefprotokoll")
public class PruefprotokollController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityPruefprotokoll eg = gson.fromJson(jsonString, EntityPruefprotokoll.class);
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
        em.refresh(em.find(EntityPruefprotokoll.class, id));
        EntityPruefprotokoll eg = em.find(EntityPruefprotokoll.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityPruefprotokoll e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityPruefprotokoll> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }
}
