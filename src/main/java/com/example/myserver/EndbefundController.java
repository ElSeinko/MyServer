package com.example.myserver;

import com.example.myserver.model.EntityFmendbefund;
import com.google.gson.Gson;
import jakarta.persistence.*;
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

    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityFmendbefund formular = gson.fromJson(jsonString, EntityFmendbefund.class);
        em.getTransaction().begin();

        Query query = em.createQuery("UPDATE EntityFmendbefund " +
                "SET bauausfuehrender = :bauausfuehrender, " +
                "bauwerber = :bauwerber, " +
                "befundnr = :befundnr, " +
                "imObjekt = :imObjekt, " +
                "idKunde = :idKunde, " +
                "roaDurchmesserLichteWeite = :roaDurchmesserLichteWeite, " +
                "roaMaterial = :roaMaterial, " +
                "roaLaenge = :roaLaenge, " +
                "roaSohlengeschoss = :roaSohlengeschoss, " +
                "roaZugaenglichkeit = :roaZugaenglichkeit, " +
                "vsDurchmesserLichteWeite = :vsDurchmesserLichteWeite, " +
                "vsMaterial = :vsMaterial, " +
                "vsWaaglaenge = :vsWaaglaenge, " +
                "vsIsoliert = :vsIsoliert, " +
                "vsAnschlusshoehe = :vsAnschlusshoehe, " +
                "vsSenklaenge = :vsSenklaenge, " +
                "afType = :afType, " +
                "afLeistung = :afLeistung, " +
                "afAufstellungsraum = :afAufstellungsraum, " +
                "afBrennstoff = :afBrennstoff, " +
                "afBaujahr = :afBaujahr, " +
                "afAuftellungsjahr = :afAuftellungsjahr, " +
                "pruefdatum = :pruefdatum, " +
                "idAuftrag = :idAuftrag, " +
                "imgsignature = :signature " +
                "WHERE id = :id");
        query.setParameter("id", formular.getId());
        query.setParameter("bauausfuehrender", formular.getBauausfuehrender());
        query.setParameter("bauwerber", formular.getBauwerber());
        query.setParameter("befundnr", formular.getBefundnr());
        query.setParameter("imObjekt", formular.getImObjekt());
        query.setParameter("idKunde", formular.getIdKunde());
        query.setParameter("roaDurchmesserLichteWeite", formular.getRoaDurchmesserLichteWeite());
        query.setParameter("roaMaterial", formular.getRoaMaterial());
        query.setParameter("roaLaenge", formular.getRoaLaenge());
        query.setParameter("roaSohlengeschoss", formular.getRoaSohlengeschoss());
        query.setParameter("roaZugaenglichkeit", formular.getRoaZugaenglichkeit());
        query.setParameter("vsDurchmesserLichteWeite", formular.getVsDurchmesserLichteWeite());
        query.setParameter("vsMaterial", formular.getVsMaterial());
        query.setParameter("vsWaaglaenge", formular.getVsWaaglaenge());
        query.setParameter("vsIsoliert", formular.getVsIsoliert());
        query.setParameter("vsAnschlusshoehe", formular.getVsAnschlusshoehe());
        query.setParameter("vsSenklaenge", formular.getVsSenklaenge());
        query.setParameter("afType", formular.getAfType());
        query.setParameter("afLeistung", formular.getAfLeistung());
        query.setParameter("afAufstellungsraum", formular.getAfAufstellungsraum());
        query.setParameter("afBrennstoff", formular.getAfBrennstoff());
        query.setParameter("afBaujahr", formular.getAfBaujahr());
        query.setParameter("afAuftellungsjahr", formular.getAfAuftellungsjahr());
        query.setParameter("pruefdatum", formular.getPruefdatum());
        query.setParameter("signature", formular.getImgsignature());
        query.setParameter("idAuftrag", formular.getIdAuftrag());


        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }

    @POST
    @Path("/updateNoImage")
    public String updateNoImage(String jsonString){
        EntityFmendbefund formular = gson.fromJson(jsonString, EntityFmendbefund.class);
        em.getTransaction().begin();

        Query query = em.createQuery("Update EntityAuftrag SET kundeid = :kundeid WHERE auftragid = :auftragid");
        query.setParameter("kundeid", formular.getIdKunde());
        query.setParameter("auftragid", formular.getIdAuftrag());
        query.executeUpdate();

        query = em.createQuery("UPDATE EntityFmendbefund " +
                "SET bauausfuehrender = :bauausfuehrender, " +
                "bauwerber = :bauwerber, " +
                "befundnr = :befundnr, " +
                "imObjekt = :imObjekt, " +
                "idKunde = :idKunde, " +
                "roaDurchmesserLichteWeite = :roaDurchmesserLichteWeite, " +
                "roaMaterial = :roaMaterial, " +
                "roaLaenge = :roaLaenge, " +
                "roaSohlengeschoss = :roaSohlengeschoss, " +
                "roaZugaenglichkeit = :roaZugaenglichkeit, " +
                "vsDurchmesserLichteWeite = :vsDurchmesserLichteWeite, " +
                "vsMaterial = :vsMaterial, " +
                "vsWaaglaenge = :vsWaaglaenge, " +
                "vsIsoliert = :vsIsoliert, " +
                "vsAnschlusshoehe = :vsAnschlusshoehe, " +
                "vsSenklaenge = :vsSenklaenge, " +
                "afType = :afType, " +
                "afLeistung = :afLeistung, " +
                "afAufstellungsraum = :afAufstellungsraum, " +
                "afBrennstoff = :afBrennstoff, " +
                "afBaujahr = :afBaujahr, " +
                "afAuftellungsjahr = :afAuftellungsjahr, " +
                "pruefdatum = :pruefdatum, " +
                "idAuftrag = :idAuftrag " +
                "WHERE id = :id");
        query.setParameter("id", formular.getId());
        query.setParameter("bauausfuehrender", formular.getBauausfuehrender());
        query.setParameter("bauwerber", formular.getBauwerber());
        query.setParameter("befundnr", formular.getBefundnr());
        query.setParameter("imObjekt", formular.getImObjekt());
        query.setParameter("idKunde", formular.getIdKunde());
        query.setParameter("roaDurchmesserLichteWeite", formular.getRoaDurchmesserLichteWeite());
        query.setParameter("roaMaterial", formular.getRoaMaterial());
        query.setParameter("roaLaenge", formular.getRoaLaenge());
        query.setParameter("roaSohlengeschoss", formular.getRoaSohlengeschoss());
        query.setParameter("roaZugaenglichkeit", formular.getRoaZugaenglichkeit());
        query.setParameter("vsDurchmesserLichteWeite", formular.getVsDurchmesserLichteWeite());
        query.setParameter("vsMaterial", formular.getVsMaterial());
        query.setParameter("vsWaaglaenge", formular.getVsWaaglaenge());
        query.setParameter("vsIsoliert", formular.getVsIsoliert());
        query.setParameter("vsAnschlusshoehe", formular.getVsAnschlusshoehe());
        query.setParameter("vsSenklaenge", formular.getVsSenklaenge());
        query.setParameter("afType", formular.getAfType());
        query.setParameter("afLeistung", formular.getAfLeistung());
        query.setParameter("afAufstellungsraum", formular.getAfAufstellungsraum());
        query.setParameter("afBrennstoff", formular.getAfBrennstoff());
        query.setParameter("afBaujahr", formular.getAfBaujahr());
        query.setParameter("afAuftellungsjahr", formular.getAfAuftellungsjahr());
        query.setParameter("pruefdatum", formular.getPruefdatum());
        query.setParameter("idAuftrag", formular.getIdAuftrag());


        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }
}
