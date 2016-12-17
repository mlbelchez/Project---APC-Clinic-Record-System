package apc.entjava.apcclinic.businesslogic;

import apc.entjava.apcclinic.model.Patient;
import apc.entjava.apcclinic.model.PatientType;

import java.util.List;

/**
 * Created by Aira Joyce on 12/16/2016.
 */
public interface PatientTypeService {

    List<PatientType> getPatientTypes();
    void addPatientType(PatientType newPatientType);
}
