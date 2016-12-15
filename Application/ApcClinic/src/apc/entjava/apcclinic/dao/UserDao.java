package apc.entjava.apcclinic.dao;

import apc.entjava.apcclinic.businesslogic.UserLookupService;
import apc.entjava.apcclinic.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
public class UserDao implements UserLookupService{

    private EntityManagerFactory emf;

    public UserDao() {
        emf = Persistence.createEntityManagerFactory("apcclinic");
    }

    @Override
    public void register(User newUser) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();

        try {
            em.persist(newUser);
            em.getTransaction().commit();
        } catch (Exception var4) {
            em.getTransaction().rollback();
        }

        em.close();
    }

    @Override
    public User login(String username, String password) {
        EntityManager em = this.emf.createEntityManager();
        User user = null;
        em.getTransaction().begin();

        try {
            user = em.createQuery("select u from User u where u.username = :username and u.password = :password", User.class)
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
            em.getTransaction().commit();
        } catch (Exception var6) {
            em.getTransaction().rollback();
        }

        em.close();
        return user;
    }

}
