package com.example.myserver;

import com.example.myserver.model.*;
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
@Path("/maengelmldg")
public class FmMangelmldgController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmmangelmldg eg = gson.fromJson(jsonString, EntityFmmangelmldg.class);
        eg.setFmmangelmldgid(0);
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
        em.refresh(em.find(EntityFmmangelmldg.class, id));
        EntityFmmangelmldg eg = em.find(EntityFmmangelmldg.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmmangelmldg e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmmangelmldg> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }

    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityFmmangelmldg formular = gson.fromJson(jsonString, EntityFmmangelmldg.class);
        em.getTransaction().begin();

        Query query = em.createQuery("UPDATE EntityFmmangelmldg " +
                "SET auftragid = :auftragid, gemeindeamt = :gemeindeamt, rauchfangkehrer = :rauchfangkehrer, " +
                "telefon = :telefon, objekt = :objekt, mangel1 = :mangel1, mangel2 = :mangel2, " +
                "mangel3 = :mangel3, mangel4 = :mangel4, mangel5 = :mangel5, mangel6 = :mangel6, " +
                "mangel7 = :mangel7 WHERE fmmangelmldgid = :fmmangelmldgid");

        // Setting parameters for the query
        query.setParameter("auftragid", formular.getAuftragid());
        query.setParameter("gemeindeamt", formular.getGemeindeamt());
        query.setParameter("rauchfangkehrer", formular.getRauchfangkehrer());
        query.setParameter("telefon", formular.getTelefon());
        query.setParameter("objekt", formular.getObjekt());
        query.setParameter("mangel1", formular.getMangel1());
        query.setParameter("mangel2", formular.getMangel2());
        query.setParameter("mangel3", formular.getMangel3());
        query.setParameter("mangel4", formular.getMangel4());
        query.setParameter("mangel5", formular.getMangel5());
        query.setParameter("mangel6", formular.getMangel6());
        query.setParameter("mangel7", formular.getMangel7());
        query.setParameter("fmmangelmldgid", formular.getFmmangelmldgid());


        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }
}
