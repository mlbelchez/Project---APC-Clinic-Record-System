package apc.entjava.apcclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity //Assign as Table
public class Complaint {
    private int id;
    private String allergy;
    private String complaint;

    public Complaint() {
    }

    public Complaint(int id, String allergy, String complaint) {
        this.id = id;
        this.allergy = allergy;
        this.complaint = complaint;
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
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}
