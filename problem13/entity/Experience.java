package problem13.entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience() {}

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    
    public Experience(String ID, String fullName, LocalDate doB, String phoneNum,
                    String email,List<Certificate> certificates, int expInYear, String proSkill) {
        super(ID, fullName, doB, phoneNum, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {return expInYear;}
    public String getProSkill() {return proSkill;}

    public void setExpInYear(int expInYear) {this.expInYear = expInYear;}
    public void setProSkill(String proSkill) {this.proSkill = proSkill;}

    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience{"+
            "id='" + id + "\', "+
            "fullName='" + fullName + "\', "+
            "doB='" + doB + "\', "+
            "phoneNum='" + phoneNum + "\', "+
            "email='" + email + "\', "+ 
            "expInYear='" + expInYear + "\', "+ 
            "proSkill='" + proSkill + "\'" + "}";
    }
}
