package problem13.entity;

import java.util.List;

public abstract class Employee {
    protected String id;
    protected String fullName;
    protected String doB;
    protected String phoneNum;
    protected String email;
    protected int employeeType;
    protected static int employeeCount;
    protected List<Certificate> certificates;
    

    public Employee() {}
    public Employee(String id, String fullName, String doB, String phoneNum, String email, int employeeType, List<Certificate> certificates) {
            this.id = id;
            this.fullName = fullName;
            this.doB = doB;
            this.phoneNum = phoneNum;
            this.email = email;
            this.employeeType = employeeType;
            this.certificates = certificates;
        }
    
    public abstract void showInfor();

    public String getID() {return id;}
    public String getFullName() {return fullName;}
    public String getDOB() {return doB;}
    public String getPhoneNum() {return phoneNum;}
    public String getEmail() {return email;}
    public List<Certificate> getCertificates() {return certificates;}

    public void setID(String id) {this.id = id;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public void setDOB(String doB) {this.doB = doB;}
    public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum;}
    public void setEmail(String email) {this.email = email;}
    public void setCertificates(List<Certificate> certificates) {this.certificates = certificates;}

}