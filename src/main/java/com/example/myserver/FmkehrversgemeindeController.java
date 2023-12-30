package com.example.myserver;

import com.example.myserver.model.EntityFmkehrversgemeinde;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/kehrverweigerung")
public class FmkehrversgemeindeController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmkehrversgemeinde ek = gson.fromJson(jsonString, EntityFmkehrversgemeinde.class);
        em = entityService.startTransaction();
        em.persist(ek);
        entityService.commitTransaction();
        return "true";
    }

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityFmkehrversgemeinde g = em.find(EntityFmkehrversgemeinde.class, id);
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }
}
