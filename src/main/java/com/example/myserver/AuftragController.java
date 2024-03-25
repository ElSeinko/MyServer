package com.example.myserver;

import com.example.myserver.model.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/auftrag")
public class AuftragController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Gson gson = new Gson();

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityAuftrag eg = gson.fromJson(jsonString, EntityAuftrag.class);
        eg.setAuftragid(0);
        em.getTransaction().begin();
        em.persist(eg);
        Query queryAuftrag = em.createQuery("select ea.auftragid from EntityAuftrag ea ORDER BY ea.auftragid DESC");
        List<Integer> auftragList = queryAuftrag.getResultList();
        int auftragId = auftragList.get(0);
        createFormular(eg, auftragId);
        return String.valueOf(auftragId);
    }

    public void createFormular(EntityAuftrag eg, int auftragId){
        if (eg.getFormular().equals("Endbefund")) {
            EntityFmendbefund formular = new EntityFmendbefund();
            formular.setIdAuftrag(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Erhebungsblatt")) {
            EntityFmerhebungsblatt formular = new EntityFmerhebungsblatt();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Maengelmeldungen")) {
            EntityFmmangelmldg formular = new EntityFmmangelmldg();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Gasbefund")) {
            EntityFmgasbefund formular = new EntityFmgasbefund();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Kehrverweigerung")) {
            EntityFmkehrversgemeinde formular = new EntityFmkehrversgemeinde();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Prüfprotokoll+B8201")) {
            EntityPruefprotokollb8201 formular = new EntityPruefprotokollb8201();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Prüfprotokoll")) {
            EntityPruefprotokoll formular = new EntityPruefprotokoll();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Vorbefund Mitarbeiter")) {
            EntityFmvorbefund formular = new EntityFmvorbefund();
            formular.setAuftragid(auftragId);
            em.persist(formular);
        }
        em.flush();
        em.getTransaction().commit();
    }

    @POST
    @Path("/neuFromAndroid")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neuFromAndroid(String jsonString){
        String[] jsonStringSplit = jsonString.split(";");
        em.getTransaction().begin();
        EntityAuftrag eg = gson.fromJson(jsonStringSplit[0], EntityAuftrag.class);
        eg.setAuftragid(0);
        em.persist(eg);
        Query queryAuftrag = em.createQuery("select ea.auftragid from EntityAuftrag ea ORDER BY ea.auftragid DESC");
        List<Integer> auftragList = queryAuftrag.getResultList();
        int auftragId = auftragList.get(0);
        if (eg.getFormular().equals("Endbefund")) {
            EntityFmendbefund formular = gson.fromJson(jsonStringSplit[1], EntityFmendbefund.class);
            formular.setIdAuftrag(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Erhebungsblatt")) {
            EntityFmerhebungsblatt formular = gson.fromJson(jsonStringSplit[1], EntityFmerhebungsblatt.class);
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Maengelmeldungen")) {
            EntityFmmangelmldg formular = gson.fromJson(jsonStringSplit[1], EntityFmmangelmldg.class);
            formular.setAuftragid(auftragId);
            formular.setFmmangelmldgid(0);
            em.persist(formular);
        } else if (eg.getFormular().equals("Gasbefund")) {
            EntityFmgasbefund formular = gson.fromJson(jsonStringSplit[1], EntityFmgasbefund.class);
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Kehrverweigerung")) {
            EntityFmkehrversgemeinde formular = gson.fromJson(jsonStringSplit[1], EntityFmkehrversgemeinde.class);
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Prüfprotokoll+B8201")) {
            EntityPruefprotokollb8201 formular = gson.fromJson(jsonStringSplit[1], EntityPruefprotokollb8201.class);
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Prüfprotokoll")) {
            EntityPruefprotokoll formular = gson.fromJson(jsonStringSplit[1], EntityPruefprotokoll.class);
            formular.setAuftragid(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Vorbefund Mitarbeiter")) {
            EntityFmvorbefund formular = gson.fromJson(jsonStringSplit[1], EntityFmvorbefund.class);
            formular.setAuftragid(auftragId);
            em.persist(formular);
        }
        em.flush();
        em.getTransaction().commit();
        return String.valueOf(auftragId);
    }

    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        em.getTransaction().begin();
        EntityAuftrag g = em.find(EntityAuftrag.class, id);
        String json = gson.toJson(g);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getAll")
    public String getAll(){
        em.getTransaction().begin();
        refreshTable();
        List<EntityAuftrag> list = em.createQuery("Select k from EntityAuftrag k").getResultList();
        String listJson = gson.toJson(list);
        em.getTransaction().commit();
        return listJson;
    }

    @POST
    @Path("/loeschen")
    @Consumes(MediaType.APPLICATION_JSON)
    public String loeschen(String jsonString){
        EntityAuftrag ea = gson.fromJson(jsonString, EntityAuftrag.class);
        em.getTransaction().begin();
        Query query = null;
        if (ea.getFormular().equals("Endbefund")) {
            query = em.createQuery("Delete from EntityFmendbefund where idAuftrag = :auftragid");
        } else if (ea.getFormular().equals("Erhebungsblatt")) {
            query = em.createQuery("Delete from EntityFmerhebungsblatt where auftragid = :auftragid");
        } else if (ea.getFormular().equals("Maengelmeldungen")) {
            query = em.createQuery("Delete from EntityFmmangelmldg where auftragid = :auftragid");
        } else if (ea.getFormular().equals("Gasbefund")) {
            query = em.createQuery("Delete from EntityFmgasbefund where auftragid = :auftragid");
        } else if (ea.getFormular().equals("Kehrverweigerung")) {
            query = em.createQuery("Delete from EntityFmkehrversgemeinde where auftragid = :auftragid");
        } else if (ea.getFormular().equals("Prüfprotokoll+B8201")) {
            query = em.createQuery("Delete from EntityPruefprotokollb8201 where auftragid = :auftragid");
        } else if (ea.getFormular().equals("Prüfprotokoll")) {
            query = em.createQuery("Delete from EntityPruefprotokoll where auftragid = :auftragid");
        } else if (ea.getFormular().equals("Vorbefund Mitarbeiter")) {
            query = em.createQuery("Delete from EntityFmvorbefund where auftragid = :auftragid");
        }
        query.setParameter("auftragid", ea.getAuftragid());
        query.executeUpdate();
        query = em.createQuery("delete from EntityAuftrag  where auftragid = :auftragid");
        query.setParameter("auftragid", ea.getAuftragid());
        query.executeUpdate();
        em.getTransaction().commit();
        return "true";

    }



    @POST
    @Path("/aendern")
    @Consumes(MediaType.APPLICATION_JSON)
    public String aendern(String jsonString){
        em.getTransaction().begin();
        Type mapType = new TypeToken<List<EntityAuftrag>>() {}.getType();
        List<EntityAuftrag> list = gson.fromJson(jsonString, mapType);
        list.sort(Comparator.comparing(x -> x.getAuftragid()));
        List<EntityAuftrag> currentList = em.createQuery("select e from EntityAuftrag e ORDER BY e.auftragid asc ").getResultList();


        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).getFormular().equals(currentList.get(i).getFormular())){

            }
        }

        Query query = em.createQuery("update EntityAuftrag set kundeid = :kundeid, formular = :formular, postleitzahl = :postleitzahl, ort = :ort, strasse = :strasse, hausnummer = :hausnummer, tuer = :tuer, telnummer = :telnummer, datum = :datum, anmerkung = :anmerkung where auftragid = :auftragid");
        for (int i = 0; i < list.size(); i++) {
            query.setParameter("auftragid", list.get(i).getAuftragid());
            query.setParameter("kundeid", list.get(i).getKundeid());
            query.setParameter("formular", list.get(i).getFormular());
            query.setParameter("postleitzahl", list.get(i).getPostleitzahl());
            query.setParameter("ort", list.get(i).getOrt());
            query.setParameter("strasse", list.get(i).getStrasse());
            query.setParameter("hausnummer", list.get(i).getHausnummer());
            query.setParameter("tuer", list.get(i).getTuer());
            query.setParameter("telnummer", list.get(i).getTelnummer());
            query.setParameter("datum", list.get(i).getDatum());
            query.setParameter("anmerkung", list.get(i).getAnmerkung());
            query.executeUpdate();
        }
        em.getTransaction().commit();
        return "true";

    }

    public void refreshTable(){
        List<EntityAuftrag> list = em.createQuery("Select k from EntityAuftrag k").getResultList();
        for (int i = 0; i < list.size()-1; i++){
            em.refresh(em.find(EntityAuftrag.class, list.get(i).getAuftragid()));
        }
    }
}
