package problem02;

public class Magazine extends Document{
    private int issueNum;
    private int issueMonth;

    public Magazine(String docID, String NXB, int numPub, int issueNum, int issueMonth) {
        super(docID, NXB, numPub);
        this.issueNum = issueNum;
        this.issueMonth = issueMonth;
    }

    public int getIssueNum() {
        return issueNum;
    }
    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }
}
