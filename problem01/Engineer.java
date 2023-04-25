package problem01;

public class Engineer extends Officier{
    private String branch;
    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String GetBranch() {
        return branch;
    }
    public void SetBranch(String branch) {
        this.branch = branch;
    }
}
