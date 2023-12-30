package com.example.myserver;

import com.example.myserver.model.EntityAuftrag;
import com.example.myserver.model.EntityEndbefund;
import com.example.myserver.model.EntityKunde;
import com.google.gson.Gson;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/auftrag")
public class AuftragController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    Gson gson = new Gson();
    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityAuftrag g = em.find(EntityAuftrag.class, id);
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }

    @GET
    @Path("/getAll")
    public String getAll(){
        em = entityService.startTransaction();
        List<EntityAuftrag> list = em.createQuery("Select k from EntityAuftrag k").getResultList();
        String listJson = gson.toJson(list);
        entityService.commitTransaction();
        return listJson;
    }
}
