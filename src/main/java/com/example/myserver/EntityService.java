package com.example.myserver;

import jakarta.persistence.*;
import jakarta.transaction.Transaction;

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
