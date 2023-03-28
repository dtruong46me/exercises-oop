package problem3;

public class Candidates {
    protected int canID;
    protected String name;
    protected String address;
    protected String priority;

    public Candidates(int canID, String name, String address, String priority) {
        this.canID = canID;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public int getCandidateID() {
        return canID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPriority() {
        return priority;
    }

    public void setCandidateID(int canID) {
        this.canID = canID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
}
