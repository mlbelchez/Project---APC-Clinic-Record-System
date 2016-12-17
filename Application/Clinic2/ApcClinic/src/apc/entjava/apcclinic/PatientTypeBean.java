package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.PatientService;
import apc.entjava.apcclinic.businesslogic.PatientTypeService;
import apc.entjava.apcclinic.dao.PatientDao;
import apc.entjava.apcclinic.dao.PatientTypeDao;
import apc.entjava.apcclinic.model.Patient;
import apc.entjava.apcclinic.model.PatientType;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aira Joyce on 12/16/2016.
 */
@ManagedBean
@ViewScoped
public class PatientTypeBean implements Serializable{

    private PatientTypeService patientTypeService = new PatientTypeDao();
    private PatientType patientType;
    private String typeName;

    private List<PatientType> patientTypes;

    public PatientType getPatientType() {
        if(this.patientType == null){
            this.patientType = new PatientType();
        }
        return patientType;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<PatientType> getPatientTypes() {
        patientTypes = patientTypeService.getPatientTypes();
        return patientTypes;
    }

    public String addPatientType() {
        this.patientTypeService.addPatientType(patientType);
        return ("type");
    }
}
