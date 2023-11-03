package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DAO <T>{

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("library-punit");
    protected EntityManager em = EMF.createEntityManager();

    protected void connect(){
        if (!em.isOpen()){
            em = EMF.createEntityManager();
        }
    }

    protected void disconnect(){
        if (em.isOpen()){
            em.close();
        }
    }

    protected void create(T object){
        connect();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(object);
        transaction.commit();

        disconnect();
    }

    protected void update(T object){
        connect();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(object);
        transaction.commit();

        disconnect();
    }

    protected void delete(T object){
        connect();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(object);
        transaction.commit();

        disconnect();
    }

}
