package problem02;

public class Document {
    protected String docID;
    protected String NXB;
    protected int numPub;

    public Document(String docID, String NXB, int numPub) {
        this.docID = docID;
        this.NXB = NXB;
        this.numPub = numPub;
    }

    public String getDocID() {
        return docID;
    }
    public String getNXB() {
        return NXB;
    }
    public int getNumPub() {
        return numPub;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    } 
    public void setNXB(String NXB) {
        this.NXB = NXB;
    }
    public void setNumPub(int numPub) {
        this.numPub = numPub;
    }

}
