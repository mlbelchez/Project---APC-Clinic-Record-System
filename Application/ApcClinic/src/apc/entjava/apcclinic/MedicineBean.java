package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.MedicineService;
import apc.entjava.apcclinic.dao.MedicineDao;
import apc.entjava.apcclinic.model.Medicine;


import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
@ManagedBean
public class MedicineBean {
    private MedicineService medicineService = new MedicineDao();

    private Medicine medicine;
    private int quantity;
    private String medicineGiven;

    private List<Medicine> medicines;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
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

    public List<Medicine> getMedicines() {
        medicines = medicineService.getMedicine();
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public String addMedicine() {
        this.medicineService.addMedicine(medicine);
        return ("medicine");
    }

}
