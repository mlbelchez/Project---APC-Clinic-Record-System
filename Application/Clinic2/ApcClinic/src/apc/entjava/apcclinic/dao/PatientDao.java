package apc.entjava.apcclinic.dao;

import apc.entjava.apcclinic.businesslogic.PatientService;
import apc.entjava.apcclinic.model.Complaint;
import apc.entjava.apcclinic.model.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
public class PatientDao implements PatientService{
    private EntityManagerFactory emf;

    public PatientDao(){
        emf = Persistence.createEntityManagerFactory("apcclinic");
    }

    @Override
    public List<Patient> getPatients() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Patient> patients =
                    em.createQuery("FROM Patient ", Patient.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return patients;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public void addPatient(Patient newPatient) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newPatient);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }

}

