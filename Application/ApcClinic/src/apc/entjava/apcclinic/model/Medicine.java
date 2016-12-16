package apc.entjava.apcclinic.model;

import javax.persistence.*;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity
public class Medicine {

    private Complaint complaint;
    private int id;
    private int quantity;
    private String medicineGiven;

    public Medicine() {
    }

    public Medicine(int id, int quantity, String medicineGiven) {
        this.id = id;
        this.quantity = quantity;
        this.medicineGiven = medicineGiven;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false, length = 2)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(nullable = false)
    public String getMedicineGiven() {
        return medicineGiven;
    }

    public void setMedicineGiven(String medicineGiven) {
        this.medicineGiven = medicineGiven;
    }

@ManyToOne
    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
}
