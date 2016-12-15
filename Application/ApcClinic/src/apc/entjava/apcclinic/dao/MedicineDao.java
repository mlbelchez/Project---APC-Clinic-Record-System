package apc.entjava.apcclinic.dao;

import apc.entjava.apcclinic.businesslogic.MedicineService;
import apc.entjava.apcclinic.model.Medicine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
public class MedicineDao implements MedicineService{
    private EntityManagerFactory emf;

    public MedicineDao(){
        emf = Persistence.createEntityManagerFactory("apcclinic");

    }

    @Override
    public List<Medicine> getMedicine() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Medicine> medicines =
                    em.createQuery("FROM Medicine", Medicine.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return medicines;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public void addMedicine(Medicine newMedicine) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newMedicine);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().commit();
        }
        em.close();
    }
}
