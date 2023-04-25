package problem17.view;

import java.util.ArrayList;
import java.util.Scanner;

import problem17.controller.DataController;
import problem17.model.Book;

public class View {
    public static void showMenu() {
        System.out.println("-------STUDENTS MANAGEMENT-------");
        System.out.println("Enter 1 : Insert book into file");
        System.out.println("Enter 2 : Display books in file");
        System.out.println("Enter 3 : ");
        System.out.println("Enter 4 : ");;
        System.out.println("Enter 5 : ");;
        System.out.println("Enter 6 : ");;
        System.out.println("Enter 7 : ");
        System.out.println("Enter 8 : Exit");
        System.out.print("Enter your choice: ");
    }
    
    public static void main(String[] args) {
        int choice;
        var booksFileName = "BOOK.DAT";
        var controller = new DataController();
        var books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);

        do {
            View.showMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String[] specializations = {"Science", "Art", "Economic", "IT"};
                    String bookName, author, sp="";
                    String spec="";
                    int year, quantity;

                    System.out.print("+ Enter book name : ");
                    bookName = scanner.nextLine();

                    System.out.print("+ Enter the author : ");
                    author = scanner.nextLine();

                    while (sp!="a" || sp!="b" || sp!="c" || sp!="d") {
                        System.out.print("+ Enter the specialization : ");
                        System.out.println("\n(a). Science\n(b). Art\n(c). Economic\n(d). IT");
                        System.out.print("Enter your choice : ");
                        sp = scanner.nextLine();
                        break;
                    } 
                    if (sp == "a") {spec = specializations[0];}
                    else if (sp == "b") {spec = specializations[1];}
                    else if (sp == "c") {spec = specializations[2];}
                    else if (sp == "d") {spec = specializations[3];}
                    
                    System.out.print("+ Enter the publish year : ");
                    year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("+ Enter the quantity : ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(0, bookName, author, spec, year, quantity);
                    controller.writeBookToFile(book, booksFileName);
                    break;

                case 2:

                    break;

                case 8:
                    return;
            }
            // scanner.close();
        } while(choice != 8);
    }
}
