package apc.entjava.apcclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Aira Joyce on 12/14/2016.
 */
@Entity
public class Patient {

    private int id;
    private int idNumber;
    private String  lastname;
    private String  firstname;
    private String  middleInitial;
    private String  gender;
    private int age;
    private String DeptOrCourse;
    private Enum Student,Faculty,Staff;

    public Patient() {
    }

    public Patient(int id, int idNumber, String lastname, String firstname,
                   String middleInitial, String gender, int age, String deptOrCourse, Enum student, Enum faculty, Enum staff) {
        this.id = id;
        this.idNumber = idNumber;
        this.lastname = lastname;
        this.firstname = firstname;
        this.middleInitial = middleInitial;
        this.gender = gender;
        this.age = age;
        DeptOrCourse = deptOrCourse;
        Student = student;
        Faculty = faculty;
        Staff = staff;
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable=false, length=12)
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Column(nullable=false, length=30)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(nullable=false, length=30)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Column(length=2)
    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    @Column(nullable=false, length=6)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(nullable=false, length=2)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(nullable=false, length=35)
    public String getDeptOrCourse() {
        return DeptOrCourse;
    }

    public void setDeptOrCourse(String deptOrCourse) {
        DeptOrCourse = deptOrCourse;
    }
    @Column(nullable=false)
    public Enum getStudent() {
        return Student;
    }

    public void setStudent(Enum student) {
        Student = student;
    }

    @Column(nullable=false)
    public Enum getFaculty() {
        return Faculty;
    }

    public void setFaculty(Enum faculty) {
        Faculty = faculty;
    }

    @Column(nullable=false)
    public Enum getStaff() {
        return Staff;
    }

    public void setStaff(Enum staff) {
        Staff = staff;
    }
}

