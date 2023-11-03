package org.services;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAService {

    private static JPAService instance;

    private EntityManagerFactory entityManagerFactory;

    private JPAService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("myPUnit");
    }

    public static JPAService getInstance() {
        return instance == null ? instance = new JPAService() : instance;
    }

    public void shutDown() {
        if(entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
