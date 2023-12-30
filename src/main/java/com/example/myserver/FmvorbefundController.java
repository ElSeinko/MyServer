package com.example.myserver;

import com.example.myserver.model.EntityFmkehrversgemeinde;
import com.example.myserver.model.EntityFmvorbefund;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/vorbefund")
public class FmvorbefundController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmvorbefund ek = gson.fromJson(jsonString, EntityFmvorbefund.class);
        em = entityService.startTransaction();
        em.persist(ek);
        entityService.commitTransaction();
        return "true";
    }

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityFmvorbefund g = em.find(EntityFmvorbefund.class, id);
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }
}
