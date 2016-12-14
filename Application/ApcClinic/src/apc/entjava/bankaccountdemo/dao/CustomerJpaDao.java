package apc.entjava.bankaccountdemo.dao;

import apc.entjava.bankaccountdemo.businesslogic.CustomerLookupService;
import apc.entjava.bankaccountdemo.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by jacobcat on 12/1/2016.
 */
public class CustomerJpaDao implements CustomerLookupService {

    private EntityManagerFactory emf;

    public CustomerJpaDao() {
        emf = Persistence.createEntityManagerFactory("BankDB");
    }

    @Override
    public Customer findCustomer(String id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Customer customer =
                    em.createQuery("select c from Customer c where c.customerId = :customer_id",
                            Customer.class)
                            .setParameter("customer_id", id)
                            .getSingleResult();
            em.getTransaction().commit();
            em.close();
            return customer;
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public List<Customer> getCustomers() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            List<Customer> customers =
                    em.createQuery("from Customer", Customer.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return customers;
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }
}
