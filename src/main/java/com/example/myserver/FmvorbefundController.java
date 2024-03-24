package com.example.myserver;

import com.example.myserver.model.EntityFmkehrversgemeinde;
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
@Path("/vorbefund")
public class FmvorbefundController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmvorbefund eg = gson.fromJson(jsonString, EntityFmvorbefund.class);
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
        em.refresh(em.find(EntityFmvorbefund.class, id));
        EntityFmvorbefund eg = em.find(EntityFmvorbefund.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmvorbefund e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmvorbefund> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }

    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityFmvorbefund formular = gson.fromJson(jsonString, EntityFmvorbefund.class);
        em.getTransaction().begin();

        Query query = em.createQuery("UPDATE EntityFmvorbefund " +
                "SET auftragid = :auftragid, objekt = :objekt, rauchfangbauart = :rauchfangbauart, " +
                "fanghoehem = :fanghoehem, fanghoehecm = :fanghoehecm, fanglaenge = :fanglaenge, " +
                "betriebsdich = :betriebsdich, fangaufsatz = :fangaufsatz, fangbauart2 = :fangbauart2, " +
                "hoeheanschlussstelle = :hoeheanschlussstelle, angeschlossenefeu = :angeschlossenefeu, " +
                "verlegtesver = :verlegtesver, reinigungsoeffnungerf = :reinigungsoeffnungerf, " +
                "artderfeu = :artderfeu, anf1 = :anf1, anf2 = :anf2, anf3 = :anf3, " +
                "anf4 = :anf4, hoeheanschlussstellebool = :hoeheanschlussstellebool, imgsignature = :signature " +
                "WHERE fmvorbefundid = :fmvorbefundid");

        // Setting parameters for the query
        query.setParameter("auftragid", formular.getAuftragid());
        query.setParameter("objekt", formular.getObjekt());
        query.setParameter("rauchfangbauart", formular.getRauchfangbauart());
        query.setParameter("fanghoehem", formular.getFanghoehem());
        query.setParameter("fanghoehecm", formular.getFanghoehecm());
        query.setParameter("fanglaenge", formular.getFanglaenge());
        query.setParameter("betriebsdich", formular.getBetriebsdich());
        query.setParameter("fangaufsatz", formular.getFangaufsatz());
        query.setParameter("fangbauart2", formular.getFangbauart2());
        query.setParameter("hoeheanschlussstelle", formular.getHoeheanschlussstelle());
        query.setParameter("angeschlossenefeu", formular.getAngeschlossenefeu());
        query.setParameter("verlegtesver", formular.getVerlegtesver());
        query.setParameter("reinigungsoeffnungerf", formular.getReinigungsoeffnungerf());
        query.setParameter("artderfeu", formular.getArtderfeu());
        query.setParameter("anf1", formular.getAnf1());
        query.setParameter("anf2", formular.getAnf2());
        query.setParameter("anf3", formular.getAnf3());
        query.setParameter("anf4", formular.getAnf4());
        query.setParameter("hoeheanschlussstellebool", formular.getHoeheanschlussstellebool());
        query.setParameter("signature", formular.getImgsignature());
        query.setParameter("fmvorbefundid", formular.getFmvorbefundid());


        query.executeUpdate();
        em.getTransaction().commit();

        return "true";
    }
}
