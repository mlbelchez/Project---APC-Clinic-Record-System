package apc.entjava.apcclinic;

import apc.entjava.apcclinic.businesslogic.ComplaintService;
import apc.entjava.apcclinic.dao.ComplaintDao;
import apc.entjava.apcclinic.model.Complaint;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Aira Joyce on 12/15/2016.
 */
@ManagedBean
public class ComplaintBean {

    private ComplaintService complaintService = new ComplaintDao();

    private Complaint complaint;
    private String allergy;
    private String complaints;

    private List<Complaint> ccomplaints;

    public Complaint getComplaint() {
        if(this.complaint == null){
            this.complaint = new Complaint();
        }
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public List<Complaint> getCcomplaints() {
        ccomplaints = complaintService.getComplaint();
        return ccomplaints;
    }

    public void setCcomplaints(List<Complaint> ccomplaints) {
        this.ccomplaints = ccomplaints;
       // return("xml file");
    }

    public String addComplaint() {
        this.complaintService.addComplaint(complaint);
        return ("complaint");
    }
}
