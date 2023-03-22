package Problem1;

public class Worker extends Officier{
    private int level;
    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int GetLevel() {
        return level;
    }
    public void SetLevel(int level) {
        this.level = level;
    }
    
}
