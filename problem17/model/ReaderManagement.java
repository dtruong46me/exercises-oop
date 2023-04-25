package problem17.model;

public class ReaderManagement {
    private Book book;
    private Reader reader;
    private int numOfBorrow;
    private String status;
    private int totalBorrowed;

    public ReaderManagement() {}

    public ReaderManagement(Book book) {
        this.book = book;
    }    

    public ReaderManagement(Book book, Reader reader, int numOfBorrow, String status, int totalBorrowed) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.status = status;
        this.totalBorrowed = totalBorrowed;
    }

    public Book getBook() {return book;}
    public Reader getReader() {return reader;}
    public int getNumOfBorrow() {return numOfBorrow;}
    public String getStatus() {return status;}
    public int getTotalBorrowed() {return totalBorrowed;}

    public void setBook(Book book) {this.book = book;}
    public void setReader(Reader reader) {this.reader = reader;}
    public void setNumOfBorrow(int numOfBorrow) {this.numOfBorrow = numOfBorrow;}
    public void setStatus(String status) {this.status = status;}
    public void setTotalBorrowed(int totalBorrowed) {this.totalBorrowed = totalBorrowed;}

}