import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.entities.User;
import org.services.JPAService;

import java.util.List;

public class Main {

    private static JPAService jpaService = JPAService.getInstance();

    public static void main(String[] args) {

        try{

            EntityManagerFactory emf = jpaService.getEntityManagerFactory();
            EntityManager em = emf.createEntityManager();
            EntityTransaction t = em.getTransaction();

//            Create
            t.begin();
            em.persist(new User("juan"));
            t.commit();

//            Read
            User user = em.find(User.class, 1);
            System.out.println(user);

//            Update
            t.begin();
            user.setName("rocket");
            em.merge(user);
            t.commit();

//            Delete
            t.begin();
            em.remove(user);
            t.commit();

            List<User> users = em.createQuery("SELECT a FROM User a")
                    .getResultList();

            List<User> userss = em.createQuery("SELECT a FROM User a WHERE a.name LIKE :name").setParameter("name", "dasa").getResultList();

        }finally {
            jpaService.shutDown();
        }


    }
}
