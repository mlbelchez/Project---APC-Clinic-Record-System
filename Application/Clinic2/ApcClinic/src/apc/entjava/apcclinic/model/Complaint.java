package apc.entjava.apcclinic.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity //Assign as Table
public class Complaint {

    private Patient patient;
    private int id;
    private String allergy;
    private String complaints;
    private Date date;

    public Complaint() {
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

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}
