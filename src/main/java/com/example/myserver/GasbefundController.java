package com.example.myserver;

import com.example.myserver.model.EntityFmgasbefund;
import com.example.myserver.model.EntityFmmangelmldg;
import com.example.myserver.model.EntityFmvorbefund;
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
@Path("/gasbefund")
public class GasbefundController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmgasbefund eg = gson.fromJson(jsonString, EntityFmgasbefund.class);
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
        em.refresh(em.find(EntityFmgasbefund.class, id));
        EntityFmgasbefund eg = em.find(EntityFmgasbefund.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmgasbefund e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmgasbefund> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }


    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityFmgasbefund formular = gson.fromJson(jsonString, EntityFmgasbefund.class);
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE EntityFmgasbefund " +
                "SET auftragid = :auftragid, befundnr = :befundnr,  objekt = :objekt, eigentuemer = :eigentuemer, " +
                "benutzer = :benutzer, installateur = :installateur, gasfangbaustoff = :gasfangbaustoff, " +
                "querschnitt = :querschnitt, hoefanges = :hoefanges, wirksfanghoehe = :wirksfanghoehe, " +
                "angeschlossenefeuerstaettetyp = :angeschlossenefeuerstaettetyp, leistung = :leistung, " +
                "baujahr = :baujahr, zuabluftfuehrung = :zuabluftfuehrung, " +
                "aufstellungsgeschoss = :aufstellungsgeschoss, verbindungsstueckdurchmesser = :verbindungsstueckdurchmesser, " +
                "waagrechtelaenge = :waagrechtelaenge, geschossfangsohle = :geschossfangsohle " +
                "WHERE fmgasbefundid = :fmgasbefundid");

        // Setting parameters for the query
        query.setParameter("auftragid", formular.getAuftragid());
        query.setParameter("befundnr", formular.getBefundnr());
        query.setParameter("objekt", formular.getObjekt());
        query.setParameter("eigentuemer", formular.getEigentuemer());
        query.setParameter("benutzer", formular.getBenutzer());
        query.setParameter("installateur", formular.getInstallateur());
        query.setParameter("gasfangbaustoff", formular.getGasfangbaustoff());
        query.setParameter("querschnitt", formular.getQuerschnitt());
        query.setParameter("hoefanges", formular.getHoefanges());
        query.setParameter("wirksfanghoehe", formular.getWirksfanghoehe());
        query.setParameter("angeschlossenefeuerstaettetyp", formular.getAngeschlossenefeuerstaettetyp());
        query.setParameter("leistung", formular.getLeistung());
        query.setParameter("baujahr", formular.getBaujahr());
        query.setParameter("zuabluftfuehrung", formular.getZuabluftfuehrung());
        query.setParameter("aufstellungsgeschoss", formular.getAufstellungsgeschoss());
        query.setParameter("verbindungsstueckdurchmesser", formular.getVerbindungsstueckdurchmesser());
        query.setParameter("waagrechtelaenge", formular.getWaagrechtelaenge());
        query.setParameter("geschossfangsohle", formular.getGeschossfangsohle());
        query.setParameter("fmgasbefundid", formular.getFmgasbefundid());



        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }
}
