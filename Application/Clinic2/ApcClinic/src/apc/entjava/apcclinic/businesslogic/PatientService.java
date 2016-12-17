package apc.entjava.apcclinic.businesslogic;

import apc.entjava.apcclinic.model.Complaint;
import apc.entjava.apcclinic.model.Patient;

import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
public interface PatientService {

    List<Patient> getPatients();
    void addPatient(Patient newPatient);
}
