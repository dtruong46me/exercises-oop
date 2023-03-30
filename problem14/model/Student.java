package problem14.model;

public class Student {
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universistyName;
    protected int gradeLevel;

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, int gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universistyName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }
    public String getDOB() {
        return doB;
    }
    public String getSex() {
        return sex;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getUniversityName() {
        return universistyName;
    }
    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDOB(String doB) {
        this.doB = doB;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setUniversityName(String universityName) {
        this.universistyName = universityName;
    }
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void showMyInfor(Student student) {
        System.out.println("STUDENT INFORMATION");
        System.out.println(" - Full Name    : "+fullName);
        System.out.println(" - D.O.B        :"+doB);
        System.out.println(" - Sex          :"+sex);
        System.out.println(" - Phone Number : "+phoneNumber);
        System.out.println(" - University   :"+universistyName);
        System.out.println(" - Grade Level  : "+gradeLevel);
    }

}