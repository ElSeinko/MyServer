package com.example.myserver;

import com.example.myserver.model.EntityEndbefund;
import com.example.myserver.model.EntityFeuverzul;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/endbefund")
public class EndbefundController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    Gson gson = new Gson();

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityEndbefund g = em.find(EntityEndbefund.class, id);
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }

    @POST
    @Path("/aendern")
    @Consumes(MediaType.APPLICATION_JSON)
    public String aendern(String jsonString){
        EntityEndbefund ee = gson.fromJson(jsonString, EntityEndbefund.class);
        em = entityService.startTransaction();
        Query query = em.createQuery("UPDATE EntityEndbefund ee SET ee = :endbefund where ee.befundnr = :endbefundBefundnr");
        query.setParameter("endbefund", ee).setParameter("endbefundBefundnr", ee.getBefundnr()).executeUpdate();
        entityService.commitTransaction();
        return "true";

    }

    @GET
    @Path("/getAll")
    public String getAll(){
        em = entityService.startTransaction();
        List<EntityEndbefund> list = em.createQuery("Select ee from EntityEndbefund ee").getResultList();
        String listJson = gson.toJson(list);
        entityService.commitTransaction();
        return listJson;
    }
}
