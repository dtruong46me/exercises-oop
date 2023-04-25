package problem01;

public class Officier {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    public Officier(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // ---------------------------------------------//
    public String GetName(){
        return name;
    }
    public void SetName(String name) {
        this.name = name;
    }

    // ---------------------------------------------//
    public int GetAge() {
        return age;
    }
    public void SetAge(int age) {
        this.age = age;
    }

    // ---------------------------------------------//
    public String GetGender() {
        return gender;
    }
    public void SetGender(String gender) {
        this.gender = gender;
    }

    // ---------------------------------------------//
    public String GetAddress() {
        return address;
    }
    public void SetAddress(String address) {
        this.address = address;
    }
}
