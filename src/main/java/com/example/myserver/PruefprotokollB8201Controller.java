package com.example.myserver;

import com.example.myserver.model.EntityFmgasbefund;
import com.example.myserver.model.EntityPruefprotokoll;
import com.example.myserver.model.EntityPruefprotokollb8201;
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
@Path("/pruefprotokollb8201")
public class PruefprotokollB8201Controller {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityPruefprotokollb8201 eg = gson.fromJson(jsonString, EntityPruefprotokollb8201.class);
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
        em.refresh(em.find(EntityPruefprotokollb8201.class, id));
        EntityPruefprotokollb8201 eg = em.find(EntityPruefprotokollb8201.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityPruefprotokollb8201 e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityPruefprotokollb8201> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }

    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityPruefprotokollb8201 formular = gson.fromJson(jsonString, EntityPruefprotokollb8201.class);
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE EntityPruefprotokollb8201 " +
                "SET auftragid = :auftragid, objekt1 = :objekt1, adresse1 = :adresse1, ort1 = :ort1, " +
                "datum1 = :datum1, gemeinde1 = :gemeinde1, telnr1 = :telnr1, objekt2 = :objekt2, " +
                "adresse2 = :adresse2, ort2 = :ort2, datum2 = :datum2, gemeinde2 = :gemeinde2, " +
                "telnr2 = :telnr2, roanrbez1 = :roanrbez1, roamaterial1 = :roamaterial1, " +
                "roaquerschnitt1 = :roaquerschnitt1, roahoehe1 = :roahoehe1, roamaengel1 = :roamaengel1, " +
                "roanrbez2 = :roanrbez2, roamaterial2 = :roamaterial2, roaquerschnitt2 = :roaquerschnitt2, " +
                "roahoehe2 = :roahoehe2, roamaengel2 = :roamaengel2, roanrbez3 = :roanrbez3, " +
                "roamaterial3 = :roamaterial3, roaquerschnitt3 = :roaquerschnitt3, roahoehe3 = :roahoehe3, " +
                "roamaengel3 = :roamaengel3, roanrbez4 = :roanrbez4, roamaterial4 = :roamaterial4, " +
                "roaquerschnitt4 = :roaquerschnitt4, roahoehe4 = :roahoehe4, roamaengel4 = :roamaengel4, " +
                "fvztype1 = :fvztype1, fvzbrennstoff1 = :fvzbrennstoff1, fvzraum1 = :fvzraum1, " +
                "fvzkw1 = :fvzkw1, fvzzunr1 = :fvzzunr1, fvzmaengel1 = :fvzmaengel1, fvztype2 = :fvztype2, " +
                "fvzbrennstoff2 = :fvzbrennstoff2, fvzraum2 = :fvzraum2, fvzkw2 = :fvzkw2, " +
                "fvzzunr2 = :fvzzunr2, fvzmaengel2 = :fvzmaengel2, fvztype3 = :fvztype3, " +
                "fvzbrennstoff3 = :fvzbrennstoff3, fvzraum3 = :fvzraum3, fvzkw3 = :fvzkw3, " +
                "fvzzunr3 = :fvzzunr3, fvzmaengel3 = :fvzmaengel3, fvztype4 = :fvztype4, " +
                "fvzbrennstoff4 = :fvzbrennstoff4, fvzraum4 = :fvzraum4, fvzkw4 = :fvzkw4, " +
                "fvzzunr4 = :fvzzunr4, fvzmaengel4 = :fvzmaengel4, pruefer = :pruefer, " +
                "pruefdatum = :pruefdatum, tlc = :tlc, tac = :tac, rz = :rz, co2 = :co2, " +
                "comg = :comg, eta = :eta, ispos1 = :ispos1, ispos2 = :ispos2, ispos3 = :ispos3, " +
                "ispos4 = :ispos4, imgsignature = :signature WHERE pruefprotokollb8201Id = :pruefprotokollb8201Id");

        // Setting parameters for the query
        query.setParameter("pruefprotokollb8201Id", formular.getPruefprotokollb8201Id());
        query.setParameter("auftragid", formular.getAuftragid());
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
        query.setParameter("roanrbez3", formular.getRoanrbez3());
        query.setParameter("roamaterial3", formular.getRoamaterial3());
        query.setParameter("roaquerschnitt3", formular.getRoaquerschnitt3());
        query.setParameter("roahoehe3", formular.getRoahoehe3());
        query.setParameter("roamaengel3", formular.getRoamaengel3());
        query.setParameter("roanrbez4", formular.getRoanrbez4());
        query.setParameter("roamaterial4", formular.getRoamaterial4());
        query.setParameter("roaquerschnitt4", formular.getRoaquerschnitt4());
        query.setParameter("roahoehe4", formular.getRoahoehe4());
        query.setParameter("roamaengel4", formular.getRoamaengel4());
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
        query.setParameter("fvztype3", formular.getFvztype3());
        query.setParameter("fvzbrennstoff3", formular.getFvzbrennstoff3());
        query.setParameter("fvzraum3", formular.getFvzraum3());
        query.setParameter("fvzkw3", formular.getFvzkw3());
        query.setParameter("fvzzunr3", formular.getFvzzunr3());
        query.setParameter("fvzmaengel3", formular.getFvzmaengel3());
        query.setParameter("fvztype4", formular.getFvztype4());
        query.setParameter("fvzbrennstoff4", formular.getFvzbrennstoff4());
        query.setParameter("fvzraum4", formular.getFvzraum4());
        query.setParameter("fvzkw4", formular.getFvzkw4());
        query.setParameter("fvzzunr4", formular.getFvzzunr4());
        query.setParameter("fvzmaengel4", formular.getFvzmaengel4());
        query.setParameter("pruefer", formular.getPruefer());
        query.setParameter("pruefdatum", formular.getPruefdatum());
        query.setParameter("tlc", formular.getTlc());
        query.setParameter("tac", formular.getTac());
        query.setParameter("rz", formular.getRz());
        query.setParameter("co2", formular.getCo2());
        query.setParameter("comg", formular.getComg());
        query.setParameter("eta", formular.getEta());
        query.setParameter("ispos1", formular.getIspos1());
        query.setParameter("ispos2", formular.getIspos2());
        query.setParameter("ispos3", formular.getIspos3());
        query.setParameter("ispos4", formular.getIspos4());
        query.setParameter("signature", formular.getImgsignature());



        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }
}
