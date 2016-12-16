package apc.entjava.apcclinic.model;

import javax.persistence.*;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity //Assign as Table
public class Complaint {

    private Patient patient;
    private PatientType patientType;
    private int id;
    private String allergy;
    private String complaints;
    private String dateTime;

    public Complaint() {
    }

    public Complaint(int id, String allergy, String complaints) {
        this.id = id;
        this.allergy = allergy;
        this.complaints = complaints;
    }
@Id
@GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

@Column(nullable = false)
    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

@Column(nullable = false)
    public String getComplaint() {
        return complaints;
    }

    public void setComplaint(String complaint) {
        this.complaints = complaint;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }
    @Column(nullable = false)
    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }
    @Column(nullable = false)
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

@ManyToOne
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}
