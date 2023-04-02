package problem13;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {
    private LocalDate graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {}
    public Fresher(LocalDate graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(String id, String fullName, LocalDate doB, String phoneNum, String email, List<Certificate> certificates,
                LocalDate graduationDate, String graduationRank, String education) {
        super(id, fullName, doB, phoneNum, email, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;                
    }
    
    public LocalDate getGraduationDate() {return graduationDate;}
    public String getGraduationRank() {return graduationRank;}
    public String getEducation() {return education;}

    public void setGraduationDate(LocalDate graduationDate) {this.graduationDate = graduationDate;}
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
