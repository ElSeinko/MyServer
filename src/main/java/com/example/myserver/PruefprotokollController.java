package com.example.myserver;

import com.example.myserver.model.EntityFmgasbefund;
import com.example.myserver.model.EntityPruefprotokoll;
import com.example.myserver.model.EntityPruefprotokollb8201;
import com.google.gson.Gson;
import jakarta.persistence.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/pruefprotokoll")
public class PruefprotokollController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityPruefprotokoll eg = gson.fromJson(jsonString, EntityPruefprotokoll.class);
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
        em.refresh(em.find(EntityPruefprotokoll.class, id));
        EntityPruefprotokoll eg = em.find(EntityPruefprotokoll.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityPruefprotokoll e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityPruefprotokoll> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }

    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityPruefprotokoll formular = gson.fromJson(jsonString, EntityPruefprotokoll.class);
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE EntityPruefprotokoll " +
                "SET objekt1 = :objekt1, " +
                "adresse1 = :adresse1, " +
                "ort1 = :ort1, " +
                "datum1 = :datum1, " +
                "gemeinde1 = :gemeinde1, " +
                "telnr1 = :telnr1, " +
                "objekt2 = :objekt2, " +
                "adresse2 = :adresse2, " +
                "ort2 = :ort2, " +
                "datum2 = :datum2, " +
                "gemeinde2 = :gemeinde2, " +
                "telnr2 = :telnr2, " +
                "roanrbez1 = :roanrbez1, " +
                "roamaterial1 = :roamaterial1, " +
                "roaquerschnitt1 = :roaquerschnitt1, " +
                "roahoehe1 = :roahoehe1, " +
                "roamaengel1 = :roamaengel1, " +
                "roanrbez2 = :roanrbez2, " +
                "roamaterial2 = :roamaterial2, " +
                "roaquerschnitt2 = :roaquerschnitt2, " +
                "roahoehe2 = :roahoehe2, " +
                "roamaengel2 = :roamaengel2, " +
                "fvztype1 = :fvztype1, " +
                "fvzbrennstoff1 = :fvzbrennstoff1, " +
                "fvzraum1 = :fvzraum1, " +
                "fvzkw1 = :fvzkw1, " +
                "fvzzunr1 = :fvzzunr1, " +
                "fvzmaengel1 = :fvzmaengel1, " +
                "fvztype2 = :fvztype2, " +
                "fvzbrennstoff2 = :fvzbrennstoff2, " +
                "fvzraum2 = :fvzraum2, " +
                "fvzkw2 = :fvzkw2, " +
                "fvzzunr2 = :fvzzunr2, " +
                "fvzmaengel2 = :fvzmaengel2, " +
                "pruefer = :pruefer, " +
                "pruefdatum = :pruefdatum, " +
                "tlc = :tlc, " +
                "tac = :tac, " +
                "rz = :rz, " +
                "co2 = :co2, " +
                "comg = :comg, " +
                "eta = :eta, " +
                "maengelbeheben = :maengelbeheben " +
                "WHERE pruefprotokollid = :pruefprotokollid");

        query.setParameter("objekt1", formular.getObjekt1());
        query.setParameter("adresse1", formular.getAdresse1());
        query.setParameter("ort1", formular.getOrt1());
        query.setParameter("datum1", formular.getDatum1());
        query.setParameter("gemeinde1", formular.getGemeinde1());
        query.setParameter("telnr1", formular.getTelnr1());
        query.setParameter("objekt2", formular.getObjekt2());
        query.setParameter("adresse2", formular.getAdresse2());
        query.setParameter("ort2", formular.getOrt2());
        query.setParameter("datum2", formular.getDatum2());
        query.setParameter("gemeinde2", formular.getGemeinde2());
        query.setParameter("telnr2", formular.getTelnr2());
        query.setParameter("roanrbez1", formular.getRoanrbez1());
        query.setParameter("roamaterial1", formular.getRoamaterial1());
        query.setParameter("roaquerschnitt1", formular.getRoaquerschnitt1());
        query.setParameter("roahoehe1", formular.getRoahoehe1());
        query.setParameter("roamaengel1", formular.getRoamaengel1());
        query.setParameter("roanrbez2", formular.getRoanrbez2());
        query.setParameter("roamaterial2", formular.getRoamaterial2());
        query.setParameter("roaquerschnitt2", formular.getRoaquerschnitt2());
        query.setParameter("roahoehe2", formular.getRoahoehe2());
        query.setParameter("roamaengel2", formular.getRoamaengel2());
        query.setParameter("fvztype1", formular.getFvztype1());
        query.setParameter("fvzbrennstoff1", formular.getFvzbrennstoff1());
        query.setParameter("fvzraum1", formular.getFvzraum1());
        query.setParameter("fvzkw1", formular.getFvzkw1());
        query.setParameter("fvzzunr1", formular.getFvzzunr1());
        query.setParameter("fvzmaengel1", formular.getFvzmaengel1());
        query.setParameter("fvztype2", formular.getFvztype2());
        query.setParameter("fvzbrennstoff2", formular.getFvzbrennstoff2());
        query.setParameter("fvzraum2", formular.getFvzraum2());
        query.setParameter("fvzkw2", formular.getFvzkw2());
        query.setParameter("fvzzunr2", formular.getFvzzunr2());
        query.setParameter("fvzmaengel2", formular.getFvzmaengel2());
        query.setParameter("pruefer", formular.getPruefer());
        query.setParameter("pruefdatum", formular.getPruefdatum());
        query.setParameter("tlc", formular.getTlc());
        query.setParameter("tac", formular.getTac());
        query.setParameter("rz", formular.getRz());
        query.setParameter("co2", formular.getCo2());
        query.setParameter("comg", formular.getComg());
        query.setParameter("eta", formular.getEta());
        query.setParameter("maengelbeheben", formular.getMaengelbeheben());
        query.setParameter("pruefprotokollid", formular.getPruefprotokollid());

        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }
}
