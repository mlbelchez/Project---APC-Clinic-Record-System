package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.ComplaintService;
import apc.entjava.apcclinic.businesslogic.PatientService;
import apc.entjava.apcclinic.dao.ComplaintDao;
import apc.entjava.apcclinic.dao.PatientDao;
import apc.entjava.apcclinic.model.Complaint;
import apc.entjava.apcclinic.model.Patient;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
@ManagedBean
public class PatientBean {
    private PatientService patientService = new PatientDao();

    private Patient patient;
    private String idNumber;
    private String lastname;
    private String firstname;
    private String middleInitial;
    private String gender;
    private int age;
    private String DeptOrCourse;


    private List<Patient> patients;

    public Patient getPatient() {
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

    public List<Patient> getPatients() {
        patients = patientService.getPatient();
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
        //xml
    }

    public String addPatient() {
        this.patientService.addPatient(patient);
        return ("");
    }

}
