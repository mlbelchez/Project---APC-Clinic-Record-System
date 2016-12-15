package apc.entjava.apcclinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity
public class Medicine {

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMedicineGiven() {
        return medicineGiven;
    }

    public void setMedicineGiven(String medicineGiven) {
        this.medicineGiven = medicineGiven;
    }
}
