package model;

/**
 * Created by School on 12/1/2016.
 */
public class Complaint {

    private String complaintId;
    private String complaint;
    private String complaintDateTime;
    private int patientStudentId;
    private int patientFacultyId;
    private int patientStaffId;

    public Complaint() {
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getComplaintDateTime() {
        return complaintDateTime;
    }

    public void setComplaintDateTime(String complaintDateTime) {
        this.complaintDateTime = complaintDateTime;
    }

    public int getPatientStudentId() {
        return patientStudentId;
    }

    public void setPatientStudentId(int patientStudentId) {
        this.patientStudentId = patientStudentId;
    }

    public int getPatientFacultyId() {
        return patientFacultyId;
    }

    public void setPatientFacultyId(int patientFacultyId) {
        this.patientFacultyId = patientFacultyId;
    }

    public int getPatientStaffId() {
        return patientStaffId;
    }

    public void setPatientStaffId(int patientStaffId) {
        this.patientStaffId = patientStaffId;
    }

}

