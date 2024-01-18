package com.example.myserver;

import jakarta.persistence.*;

public class EntityService {

    private EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("default");
    private EntityManager em2 = emf2.createEntityManager();
    private EntityTransaction et2 = em2.getTransaction();
    public EntityManager startTransaction(){
        et2.begin();
        return em2;
    }
    public void commitTransaction(){
        et2.commit();
    }

    public static  EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    public static EntityManager em = emf.createEntityManager();
    public static EntityTransaction et = em.getTransaction();

    public static void flush(){
        em.flush();

    }


}
