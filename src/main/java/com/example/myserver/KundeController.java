package com.example.myserver;

import com.example.myserver.model.ClassKunde;
import com.example.myserver.model.EntityEndbefund;
import com.example.myserver.model.EntityKunde;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.LinkedList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/kunde")
public class KundeController {
    private EntityService entityService = new EntityService();
    EntityManager em;
    @GET
    @Path("/getAll")
    public String getAll(){
        em = entityService.startTransaction();
        List<EntityEndbefund> list = em.createQuery("Select k from EntityKunde k").getResultList();
        Jsonb jsonb = JsonbBuilder.create();
        String listJson = jsonb.toJson(list);
        entityService.commitTransaction();
        return listJson;
    }

    @GET
    @Path("/loeschen/{id}")
    public void loeschen(@PathParam("id") int id) {
        em = entityService.startTransaction();
        EntityKunde g = em.find(EntityKunde.class, id);
        em.remove(g);
        entityService.commitTransaction();
    }

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        Jsonb jsonb = JsonbBuilder.create();
        EntityKunde ek = jsonb.fromJson(jsonString, EntityKunde.class);
        em = entityService.startTransaction();
        em.persist(ek);
        entityService.commitTransaction();
        return "true";

    }

    @POST
    @Path("/aendern")
    @Consumes(MediaType.APPLICATION_JSON)
    public String aendern(String jsonString){
        Jsonb jsonb = JsonbBuilder.create();
        List<EntityKunde> el = new LinkedList<>();
        List<EntityKunde> list = (List<EntityKunde>) jsonb.fromJson(jsonString, List.class);

        String[] splitString = jsonString.split("}");
        EntityKunde ek;
        String finishedString = "";
        StringBuilder build;
        for (int i = 0; i < splitString.length-1; i++) {
            if(i == 0)finishedString = splitString[i]+"}]";
            else {finishedString = "["+splitString[i]+"}]";
                build = new StringBuilder(finishedString);
                build.deleteCharAt(1);
                finishedString = build.toString();
            }

            ek = jsonb.fromJson(finishedString, EntityKunde.class);

            el.add(ek);

        }

        em = entityService.startTransaction();
        Query query = em.createQuery("update EntityKunde set vorname = :vorname, nachname = :nachname, postleitzahl = :plz, ort = :ort, strasse = :str, hausnummer = :hsnr, tuer = :tuer, telnummer = :tnr where kundeid = :kundennr");
        for (int i = 0; i < el.size(); i++) {
            query.setParameter("vorname", el.get(i).getVorname());
            query.setParameter("nachname", el.get(i).getNachname());
            query.setParameter("plz", el.get(i).getPostleitzahl());
            query.setParameter("ort", el.get(i).getOrt());
            query.setParameter("str", el.get(i).getStrasse());
            query.setParameter("hsnr", el.get(i).getHausnummer());
            query.setParameter("tuer", el.get(i).getTuer());
            query.setParameter("tnr", el.get(i).getTelnummer());
            query.setParameter("kundennr", el.get(i).getKundeid());
            query.executeUpdate();
        }
        entityService.commitTransaction();
        return "true";

    }
}
