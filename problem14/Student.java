package problem14;

public class Student {
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universistyName;
    protected String gradeLevel;

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
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
    public String getGradeLevel() {
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
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

}