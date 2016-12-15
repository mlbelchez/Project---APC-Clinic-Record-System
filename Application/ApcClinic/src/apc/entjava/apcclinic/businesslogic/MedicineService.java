package apc.entjava.apcclinic.businesslogic;

import apc.entjava.apcclinic.model.Medicine;

import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
public interface MedicineService {
    List<Medicine> getMedicine();
    void addMedicine(Medicine newMedicine);
}
