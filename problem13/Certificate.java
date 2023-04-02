package problem13;

import java.time.LocalDate;

public class Certificate {
    private String id;
    private String name;
    private String rank;
    private LocalDate date;

    public Certificate() {}

    public Certificate(String id, String name, String rank, LocalDate date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public String getID() {return id;}
    public String getName() {return name;}
    public String getRank() {return rank;}
    public LocalDate getDate() {return date;}

    public void setID(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setRank(String rank) {this.rank = rank;}
    public void setDate(LocalDate date) {this.date = date;}

}
