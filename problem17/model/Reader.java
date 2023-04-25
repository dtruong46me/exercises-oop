package problem17.model;

import java.io.Serializable;

public class Reader implements Serializable {
    public static int id = 10000000;
    private int readerID;
    private String fullName;
    private String address;
    private String phoneNumber;
    
    public Reader() {}

    public Reader(int readerID) {
        this.readerID = readerID;
    }

    public Reader(int readerID, String fullName, String address, String phoneNumber) {
        this.readerID = readerID;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getReaderID() {return readerID;}
    public String getFullName() {return fullName;}
    public String getAddress() {return address;}
    public String getPhoneNumber() {return phoneNumber;}

    public void setReaderID() {this.readerID = id++;}
    public void setReaderID(int id){readerID = id;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public void setAddress(String address) {this.address = address;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    
    @Override
    public String toString() {
        return getClass().getName()+"[readerID= " + readerID + ", fullName= "+ fullName
                +", address= " + address + ", phoneNumber= " + phoneNumber + "]";
    }
}
