package problem13.entity;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{
    private String major;
    private int semester;
    private String uniName;

    public Intern() {}
    public Intern(String major, int semester, String uniName) {
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public Intern(String id, String fullName, LocalDate doB, String phoneNum, String email, int employeeType, List<Certificate> certificates,
            String major, int semester, String uniName) {
        super(id, fullName, doB, phoneNum, email, employeeType, certificates);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajor() {return major;}
    public int getSemester() {return semester;}
    public String getUniName() {return uniName;}

    public void setMajor(String major) {this.major = major;}
    public void getSemester(int semester) {this.semester = semester;}
    public void setUniName(String uniName) {this.uniName = uniName;}

    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Intern{"+
            "id='" + id + "\', "+
            "fullName='" + fullName + "\', "+
            "doB='" + doB + "\', "+
            "phoneNum='" + phoneNum + "\', "+
            "email='" + email + "\', "+ 
            "major='" + major + "\', "+
            "semester='" + semester + "\', "+
            "uniName='" + uniName + "\'" + "}";
    }

}
