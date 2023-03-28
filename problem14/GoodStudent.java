package problem14;

public class GoodStudent extends Student {
    private float gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, float gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

}
