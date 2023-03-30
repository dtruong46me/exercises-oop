package JLab01;

public class Student {
    String id;
    String name;
    String semeter;
    String course;

    public Student() {}

    public Student(String id, String name, String semeter, String course) {
        this.id = id;
        this.name = name;
        this.semeter = semeter;
        this.course = course;
    }

    public String GetID() {
        return id;
    }

    public String GetName() {
        return name;
    }

    public String GetSemeter() {
        return semeter;
    }

    public String GetCourse() {
        return course;
    }

    public void SetID(String id) {
        this.id = id;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetSemeter(String semeter) {
        this.semeter = semeter;
    }

    public void SetCourse(String course) {
        this.course = course;
    }

    public void showInfor() {
        System.out.printf("%-20s%-10s%-15s\n",name, semeter, course);
    }

}
