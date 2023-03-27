package problem2;

public class Newspaper extends Document{
    private int issueDate;

    public Newspaper(String docID, String NXB, int numPub, int issueDate) {
        super(docID, NXB, numPub);
        this.issueDate = issueDate;
    }

    public int getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }
}
