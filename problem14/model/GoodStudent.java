package problem14.model;

public class GoodStudent extends Student {
    private float gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, int gradeLevel, float gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public float getGPA() {
        return gpa;
    }
    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }
    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

}
