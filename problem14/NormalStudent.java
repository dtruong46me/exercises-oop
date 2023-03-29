package problem14;

public class NormalStudent extends Student{
    private int englishScore;
    private float entryTestScore;

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, float entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
    public float getEntryTestScore() {
        return entryTestScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }
    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

}
