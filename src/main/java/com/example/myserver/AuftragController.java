package com.example.myserver;

import com.example.myserver.model.EntityAuftrag;
import com.example.myserver.model.EntityKunde;
import com.google.gson.Gson;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/auftrag")
public class AuftragController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Gson gson = new Gson();
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

    public void refreshTable(){
        List<EntityAuftrag> list = em.createQuery("Select k from EntityAuftrag k").getResultList();
        for (int i = 1; i < list.size()+1; i++){
            em.refresh(em.find(EntityAuftrag.class, i));
        }
    }
}
