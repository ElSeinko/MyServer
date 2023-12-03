package com.example.myserver;

import com.example.myserver.model.EntityEndbefund;
import com.example.myserver.model.EntityFmerhebungsblatt;
import com.example.myserver.model.EntityKunde;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.json.Json;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/erhebungsblatt")
public class ErhebungsblattController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityFmerhebungsblatt g = em.find(EntityFmerhebungsblatt.class, id);
        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.create();
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }

    @POST
    @Path("/aendern")
    @Consumes(MediaType.APPLICATION_JSON)
    public String aendern(String jsonString){
        Jsonb jsonb = JsonbBuilder.create();
        EntityEndbefund ee = jsonb.fromJson(jsonString, EntityEndbefund.class);
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
        List<EntityFmerhebungsblatt> list = em.createQuery("Select eb from EntityFmerhebungsblatt eb").getResultList();
        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.create();
        String listJson = gson.toJson(list);
        entityService.commitTransaction();
        return listJson;
    }

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){

        GsonBuilder gb = new GsonBuilder();
        Gson gson = gb.create();
        EntityFmerhebungsblatt eb = gson.fromJson(jsonString, EntityFmerhebungsblatt.class);
        em = entityService.startTransaction();
        em.persist(eb);
        entityService.commitTransaction();
        return "true";

    }

}
