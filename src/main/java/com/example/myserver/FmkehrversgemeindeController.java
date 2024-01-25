package com.example.myserver;

import com.example.myserver.model.EntityFmerhebungsblatt;
import com.example.myserver.model.EntityFmkehrversgemeinde;
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
@Path("/kehrverweigerung")
public class FmkehrversgemeindeController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    Gson gson = new Gson();
    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmkehrversgemeinde eg = gson.fromJson(jsonString, EntityFmkehrversgemeinde.class);
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
        em.refresh(em.find(EntityFmkehrversgemeinde.class, id));
        EntityFmkehrversgemeinde eg = em.find(EntityFmkehrversgemeinde.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }
    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmkehrversgemeinde e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmkehrversgemeinde> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }
}
