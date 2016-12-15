package apc.entjava.apcclinic.businesslogic;

import apc.entjava.apcclinic.model.Complaint;

import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016
 */
public interface ComplaintService {

    List<Complaint> getComplaint();
    void addComplaint(Complaint newComplaint);
}
