package JLab01;

public class Report {
    private String name;
    private String course;
    private int total;

    public Report() {}

    public Report(String name, String course, int total) {
        this.name = name;
        this.course = course;
        this.total = total;
    }

    public String GetName() {
        return name;
    }
    public String GetCourse() {
        return course;
    }
    public int GetTotalCourse() {
        return total;
    }

    public void SetName(String name) {
        this.name = name;
    }
    public void SetCourse(String course) {
        this.course = course;
    }
    public void SetTotalCourse(int total) {
        this.total = total;
    }
}
