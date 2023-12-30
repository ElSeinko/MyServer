package com.example.myserver;

import com.example.myserver.model.EntityFmgasbefund;
import com.example.myserver.model.EntityFmmangelmldg;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/gasbefund")
public class GasbefundController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmgasbefund eg = gson.fromJson(jsonString, EntityFmgasbefund.class);
        em = entityService.startTransaction();
        em.persist(eg);
        entityService.commitTransaction();
        return "true";
    }

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityFmgasbefund eg = em.find(EntityFmgasbefund.class, id);
        String json = gson.toJson(eg);
        entityService.commitTransaction();
        return json;
    }
}
