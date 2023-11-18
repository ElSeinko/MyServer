package com.example.myserver;

import com.example.myserver.model.EntityEndbefund;
import com.example.myserver.model.EntityFeuverzul;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/endbefund")
public class EndbefundController {
    private EntityService entityService = new EntityService();


    @GET
    @Path("/{id}")
    public String getEndbefundById(@PathParam("id") int id) {
        EntityManager em = entityService.startTransaction();
        EntityEndbefund g = em.find(EntityEndbefund.class, id);
        Jsonb jsonb = JsonbBuilder.create();
        String json = jsonb.toJson(g);
        entityService.commitTransaction();
        return json;
    }
}
