package com.example.myserver;

import com.example.myserver.model.EntityAuftrag;
import com.example.myserver.model.EntityFmmangelmldg;
import com.example.myserver.model.EntityKunde;
import com.example.myserver.model.EntityPruefprotokoll;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/maengelmldg")
public class FmMangelmldgController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmmangelmldg eg = gson.fromJson(jsonString, EntityFmmangelmldg.class);
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
        em.refresh(em.find(EntityFmmangelmldg.class, id));
        EntityFmmangelmldg eg = em.find(EntityFmmangelmldg.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

}
