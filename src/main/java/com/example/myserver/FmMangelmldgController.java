package com.example.myserver;

import com.example.myserver.model.EntityAuftrag;
import com.example.myserver.model.EntityFmmangelmldg;
import com.example.myserver.model.EntityKunde;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/maengelmldg")
public class FmMangelmldgController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmmangelmldg ek = gson.fromJson(jsonString, EntityFmmangelmldg.class);
        em = entityService.startTransaction();
        em.persist(ek);
        entityService.commitTransaction();
        return "true";
    }

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityFmmangelmldg g = em.find(EntityFmmangelmldg.class, id);
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }

}
