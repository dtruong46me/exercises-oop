package Problem1;


public class Staff extends Officier{
    private String task;
    public Staff(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String GetTask(){
        return task;
    }
    public void SetTask(String task) {
        this.task = task;
    }

}
