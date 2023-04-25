package problem02;

public class Book extends Document{
    private String author;
    private int numPage;

    public Book(String docID, String NXB, int numPub,String author, int numPage) {
        super(docID, NXB, numPub);
        this.author = author;
        this.numPage = numPage;
    }

    public String getName() {
        return author;
    }
    public int getNumPage() {
        return numPage;
    }

    public void setName(String author) {
        this.author = author;
    }
    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
}
