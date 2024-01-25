package com.example.myserver;

import com.example.myserver.model.EntityFmendbefund;
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
        EntityFmendbefund eg = gson.fromJson(jsonString, EntityFmendbefund.class);
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
        em.refresh(em.find(EntityFmendbefund.class, id));
        EntityFmendbefund eg = em.find(EntityFmendbefund.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmendbefund e WHERE e.idAuftrag = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmendbefund> list = query.getResultList();
        String json = gson.toJson(list.get(0));
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
    @GET
    @Path("/getAll")
    public String getAll(){
        em.getTransaction().begin();
        List<EntityFmendbefund> list = em.createQuery("Select ee from EntityFmendbefund ee").getResultList();
        String listJson = gson.toJson(list);
        em.getTransaction().commit();
        return listJson;
    }
}
