package problem13.entity;

import java.util.List;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {}
    public Fresher(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(String id, String fullName, String doB, String phoneNum, String email, int employeeType, List<Certificate> certificates,
                String graduationDate, String graduationRank, String education) {
        super(id, fullName, doB, phoneNum, email, employeeType, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;                
    }
    
    public String getGraduationDate() {return graduationDate;}
    public String getGraduationRank() {return graduationRank;}
    public String getEducation() {return education;}

    public void setGraduationDate(String graduationDate) {this.graduationDate = graduationDate;}
    public void setGraduationRank(String graduationRank) {this.graduationRank = graduationRank;}
    public void setEducation(String education) {this.education = education;}

    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher{" +
            "id='" + id + "\', " +
            "fullName='" + fullName + "\', "+
            "doB='" + doB + "\', "+ 
            "phoneNum='" + phoneNum + "\'" + 
            "email='" + email + "\', " +
            "graduationDate='" + graduationDate + "\', "+
            "graduationRank='" + graduationRank + "\', "+
            "education='" + education + "\'" + "}";
    }

}
