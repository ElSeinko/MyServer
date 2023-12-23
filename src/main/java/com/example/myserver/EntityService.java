package com.example.myserver;

import jakarta.persistence.*;

public class EntityService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();
    public EntityManager startTransaction(){
        et.begin();
        return em;
    }
    public void commitTransaction(){
        et.commit();
    }


}
