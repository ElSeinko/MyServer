package com.example.myserver;

import com.example.myserver.model.EntityFmendbefund;
import com.example.myserver.model.EntityFmerhebungsblatt;
import com.example.myserver.model.EntityKunde;
import com.example.myserver.model.EntityPruefprotokoll;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/erhebungsblatt")
public class ErhebungsblattController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Gson gson = new Gson();
    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        EntityFmerhebungsblatt eg = em.find(EntityFmerhebungsblatt.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

//    @POST
//    @Path("/aendern")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public String aendern(String jsonString){
//        EntityFmerhebungsblatt ee = gson.fromJson(jsonString, EntityFmerhebungsblatt.class);
//        em = entityService.startTransaction();
//        Query query = em.createQuery("UPDATE EntityFmerhebungsblatt ee SET ee = :endbefund where ee.befundnr = :endbefundBefundnr");
//        query.setParameter("endbefund", ee).setParameter("endbefundBefundnr", ee.getBefundnr()).executeUpdate();
//        entityService.commitTransaction();
//        return "true";
//
//    }

    @GET
    @Path("/getAll")
    public String getAll(){
        em.getTransaction().begin();
        List<EntityFmerhebungsblatt> list = em.createQuery("Select eb from EntityFmerhebungsblatt eb").getResultList();
        String listJson = gson.toJson(list);
        em.getTransaction().commit();
        return listJson;
    }

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmerhebungsblatt eb = gson.fromJson(jsonString, EntityFmerhebungsblatt.class);
        em.getTransaction().begin();
        em.persist(eb);
        em.flush();
        em.getTransaction().commit();
        return "true";

    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmerhebungsblatt e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmerhebungsblatt> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }

}
