package problem17.model;

public class Book {
    private static int id = 100000;
    private int bookID;
    private String bookName;
    private String author;
    private String specialization;
    private int publishYear;
    private int quantity;

    public Book() {}

    public Book(int bookID) {
        this.bookID = bookID;
    }

    public Book(int bookID, String bookName, String author, String specialization, int publishYear, int quantity) {
        if (bookID == 0) {
            this.bookID = id++;
        } else {
            this.bookID = bookID;
        }
        
        this.bookName = bookName;
        this.author = author;
        this.specialization = specialization;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public int getBookID() {return bookID;}
    public String getBookName() {return bookName;}
    public String getAuthor() {return author;}
    public String getSpecialization() {return specialization;}
    public int getPublishYear() {return publishYear;}
    public int getQuantity() {return quantity;}

    public void setBookID() {this.bookID = id++;}
    public void setBookID(int id){bookID = id;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public void setAuthor(String author) {this.author = author;}
    public void setSpecialization(String specialization) {this.specialization = specialization;}
    public void setPublishYear(int publishYear) {this.publishYear = publishYear;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    
    @Override
    public String toString() {
        return getClass().getName() + "[bookID= " + bookID + ", bookName= " + bookName
                + ", specialization= " + specialization + ", author= " + author
                + ", publishYear= " + publishYear + ", quantity= " + quantity + "]";
    }

}
