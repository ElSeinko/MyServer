package com.example.myserver;

import com.example.myserver.model.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.lang.reflect.Type;
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
        em.getTransaction().begin();
        em.persist(eg);
        Query queryAuftrag = em.createQuery("select ea.auftragid from EntityAuftrag ea ORDER BY ea.auftragid DESC");
        List<Integer> auftragList = queryAuftrag.getResultList();
        int auftragId = auftragList.get(0);
        if (eg.getFormular().equals("Endbefund")) {
            EntityFmendbefund formular = new EntityFmendbefund();
            formular.setIdAuftrag(auftragId);
            em.persist(formular);
        } else if (eg.getFormular().equals("Erhebungsblatt")) {
            EntityFmerhebungsblatt formular = new EntityFmerhebungsblatt();
            em.persist(formular);
            return String.valueOf(formular.getFmerhebungsblattid());
        } else if (eg.getFormular().equals("Maengelmeldungen")) {
            EntityFmmangelmldg formular = new EntityFmmangelmldg();
            em.persist(formular);
            return String.valueOf(formular.getFmmangelmldgid());
        } else if (eg.getFormular().equals("Gasbefund")) {
            EntityFmgasbefund formular = new EntityFmgasbefund();
            em.persist(formular);
            return String.valueOf(formular.getFmgasbefundid());
        } else if (eg.getFormular().equals("Kehrverweigerung")) {
            EntityFmkehrversgemeinde formular = new EntityFmkehrversgemeinde();
            em.persist(formular);
            return String.valueOf(formular.getFmkehrversgemeindeid());
        } else if (eg.getFormular().equals("Prüfprotokoll+B8201")) {
            EntityPruefprotokollb8201 formular = new EntityPruefprotokollb8201();
            em.persist(formular);
            return String.valueOf(formular.getPruefprotokollb8201Id());
        } else if (eg.getFormular().equals("Prüfprotokoll")) {
            EntityPruefprotokoll formular = new EntityPruefprotokoll();
            em.persist(formular);
            return String.valueOf(formular.getPruefprotokollid());
        } else if (eg.getFormular().equals("Vorbefund Mitarbeiter")) {
            EntityFmvorbefund formular = new EntityFmvorbefund();
            em.persist(formular);
            return String.valueOf(formular.getFmvorbefundid());
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
    @Path("/aendern")
    @Consumes(MediaType.APPLICATION_JSON)
    public String aendern(String jsonString){
        Type mapType = new TypeToken<List<EntityAuftrag>>() {}.getType();
        List<EntityAuftrag> list = gson.fromJson(jsonString, mapType);


        em.getTransaction().begin();
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
        for (int i = 1; i < list.size()+1; i++){
            em.refresh(em.find(EntityAuftrag.class, i));
        }
    }
}
