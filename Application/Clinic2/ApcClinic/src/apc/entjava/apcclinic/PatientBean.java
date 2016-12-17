package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.ComplaintService;
import apc.entjava.apcclinic.businesslogic.PatientService;
import apc.entjava.apcclinic.businesslogic.PatientTypeService;
import apc.entjava.apcclinic.dao.ComplaintDao;
import apc.entjava.apcclinic.dao.PatientDao;
import apc.entjava.apcclinic.dao.PatientTypeDao;
import apc.entjava.apcclinic.model.Complaint;
import apc.entjava.apcclinic.model.Patient;
import apc.entjava.apcclinic.model.PatientType;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
@ManagedBean
@ViewScoped
public class PatientBean implements Serializable {
    private PatientService patientService = new PatientDao();
    private PatientTypeService patientTypeService = new PatientTypeDao();

    private Patient patient;
    private List<Patient> patients;
    private List<PatientType> patientTypes;

    private String idNumber;
    private String lastname;
    private String firstname;
    private String middleInitial;
    private String gender;
    private int age;
    private String DeptOrCourse;


    public Patient getPatient() {
        if (this.patient == null){
            this.patient = new Patient();
        }
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDeptOrCourse() {
        return DeptOrCourse;
    }

    public void setDeptOrCourse(String deptOrCourse) {
        DeptOrCourse = deptOrCourse;
    }

    public String addPatient() {
        this.patientService.addPatient(patient);
        return ("patient");
    }

    public List<Patient> getPatients() {
        patients = patientService.getPatients();
        return patients;
    }

    public List<PatientType> getPatientTypes() {
        patientTypes = patientTypeService.getPatientTypes();
        return patientTypes;
    }

    public void setPatientTypes(List<PatientType> patientTypes) {
        this.patientTypes = patientTypes;
    }
}
