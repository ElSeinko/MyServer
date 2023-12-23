package com.example.myserver;

import com.example.myserver.model.EntityFeuverzul;
import com.google.gson.Gson;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.net.http.HttpClient;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/feuerzul")
public class FeuerzulController {
    private EntityService entityService = new EntityService();
    Gson gson = new Gson();

    @GET
    @Path("/{id}")
    public String getFeuerzulById(@PathParam("id") int id) {
        EntityManager em = entityService.startTransaction();
        EntityFeuverzul g = em.find(EntityFeuverzul.class, id);
        String json = gson.toJson(g);
        entityService.commitTransaction();
        return json;
    }
}
