package apc.entjava.apcclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Aira Joyce on 12/16/2016.
 */
@Entity
public class PatientType {

    private int id;
    private String typeName;

    public PatientType() {
    }

    public PatientType(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false, unique = true, length = 25)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}

