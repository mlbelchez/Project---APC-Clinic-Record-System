package apc.entjava.apcclinic.dao;

import apc.entjava.apcclinic.businesslogic.PatientTypeService;
import apc.entjava.apcclinic.model.Complaint;
import apc.entjava.apcclinic.model.Patient;
import apc.entjava.apcclinic.model.PatientType;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Aira Joyce on 12/16/2016.
 */

public class PatientTypeDao implements PatientTypeService{
    private EntityManagerFactory emf;

    public PatientTypeDao(){
        emf = Persistence.createEntityManagerFactory("apcclinic");
    }


    @Override
    public List<PatientType> getPatientTypes() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<PatientType> patientTypes =
                    em.createQuery("FROM PatientType ", PatientType.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return patientTypes;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public void addPatientType(PatientType newPatientType) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newPatientType);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }

}
