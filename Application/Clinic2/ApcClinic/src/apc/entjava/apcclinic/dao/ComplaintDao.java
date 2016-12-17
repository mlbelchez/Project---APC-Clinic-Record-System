package apc.entjava.apcclinic.dao;

import apc.entjava.apcclinic.businesslogic.ComplaintService;
import apc.entjava.apcclinic.model.Complaint;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
public class ComplaintDao implements ComplaintService{
    private EntityManagerFactory emf;

    public ComplaintDao(){
        emf = Persistence.createEntityManagerFactory("apcclinic");

    }

    @Override
    public List<Complaint> getComplaint() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Complaint> ccomplaints =
                    em.createQuery("FROM Complaint", Complaint.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return ccomplaints;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public void addComplaint(Complaint newComplaint) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
           em.persist(newComplaint);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }
}
