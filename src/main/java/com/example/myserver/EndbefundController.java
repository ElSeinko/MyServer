package com.example.myserver;

import com.example.myserver.model.EntityEndbefund;
import com.example.myserver.model.EntityFmkehrversgemeinde;
import com.example.myserver.model.EntityPruefprotokoll;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/endbefund")
public class EndbefundController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityEndbefund eg = gson.fromJson(jsonString, EntityEndbefund.class);
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
        em.refresh(em.find(EntityEndbefund.class, id));
        EntityEndbefund eg = em.find(EntityEndbefund.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

//    @POST
//    @Path("/aendern")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public String aendern(String jsonString){
//        EntityEndbefund ee = gson.fromJson(jsonString, EntityEndbefund.class);
//        em = entityService.startTransaction();
//        Query query = em.createQuery("UPDATE EntityEndbefund ee SET ee = :endbefund where ee.befundnr = :endbefundBefundnr");
//        query.setParameter("endbefund", ee).setParameter("endbefundBefundnr", ee.getBefundnr()).executeUpdate();
//        entityService.commitTransaction();
//        return "true";
//
//    }
//
//    @GET
//    @Path("/getAll")
//    public String getAll(){
//        em = entityService.startTransaction();
//        List<EntityEndbefund> list = em.createQuery("Select ee from EntityEndbefund ee").getResultList();
//        String listJson = gson.toJson(list);
//        entityService.commitTransaction();
//        return listJson;
//    }
}
