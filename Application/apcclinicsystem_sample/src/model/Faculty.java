package model;

/**
 * Created by School on 12/1/2016.
 */
public class Faculty {

    private int facultyId;
    private String facultyDepartment;

    public Faculty(){}

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyDepartment() {
        return facultyDepartment;
    }

    public void setFacultyDepartment(String facultyDepartment) {
        this.facultyDepartment = facultyDepartment;
    }

}
