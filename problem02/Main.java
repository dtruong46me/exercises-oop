package problem02;

import java.util.Scanner;
// import problem2.Manager;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager doc_manager = new Manager();

        while (true) {
            System.out.println("\nDOCUMENT MANAGEMENT");
            System.out.println("Enter 1 : Insert new document");
            System.out.println("Enter 2 : Delete document - by Document ID");
            System.out.println("Enter 3 : Show document information");
            System.out.println("Enter 4 : Search document - by category");
            System.out.println("Enter 5 : Exit");
            System.out.print("Enter your choice : ");
    
            String choice = sc.nextLine();

            switch (choice) {
                case "1" : {
                    System.out.println("\nINSERT NEW DOCUMENT");
                    System.out.println("Enter a : Insert book");
                    System.out.println("Enter b : Insert magazine");
                    System.out.println("Enter c : Insert newspaper");
                    System.out.print("Enter your choice : ");
                    
                    String type = sc.nextLine();

                    switch (type) {
                        case "a" : {
                            System.out.print("\nEnter Document ID : ");
                            String docID = sc.nextLine();
                            System.out.print("Enter publishing house : ");
                            String NXB = sc.nextLine();
                            System.out.print("Enter publishing No. : ");
                            int numPub = sc.nextInt();
                            System.out.print("Enter the author : ");
                            sc.nextLine();
                            String author = sc.nextLine();
                            System.out.print("Enter the number page of book : ");
                            int numPage = sc.nextInt();

                            Book book = new Book(docID, NXB, numPub, author, numPage);
                            System.out.println(">> "+book.toString());
                            sc.nextLine();
                            break;
                        }

                        case "b" : {
                            System.out.print("\nEnter Document ID : ");
                            String docID = sc.nextLine();
                            System.out.print("Enter publishing house : ");
                            String NXB = sc.nextLine();
                            System.out.print("Enter publishing No. : ");
                            int numPub = sc.nextInt();
                            System.out.print("Enter the issue number : ");
                            int issueNum = sc.nextInt();
                            System.out.print("Enter the issue month : ");
                            int issueMonth = sc.nextInt();
                            
                            Magazine magazine = new Magazine(docID, NXB, numPub, issueNum, issueMonth);
                            System.out.println(">> "+magazine.toString());
                            sc.nextLine();
                            break;
                        }
                            
                        case "c" : {
                            System.out.print("Enter Document ID : ");
                            String docID = sc.nextLine();
                            System.out.print("Enter publishing house : ");
                            String NXB = sc.nextLine();
                            System.out.print("Enter publishing No. : ");
                            int numPub = sc.nextInt();
                            System.out.print("Enter the issue date : ");
                            int issuedate = sc.nextInt();

                            Newspaper newspaper = new Newspaper(docID, NXB, numPub, issuedate);
                            System.out.println(">> "+newspaper.toString());
                            sc.nextLine();
                            break;
                        }
                            
                        default : 
                            System.out.println("Invalid input !!!");
                            break;
                        }
                    break;
                }
                    
                case "2" : {
                    System.out.println("DELETE DOCUMENT");
                    String doc_id = sc.nextLine();
                    System.out.println(doc_manager.deleteDoc(doc_id) ? "Delete Success" : "Fail to delete");
                    break;
                }

                case "3" : {
                    System.out.println("SHOW DOCUMENT INFORMATION");
                    doc_manager.showInfor();
                    break;
                }

                case "4" : {
                    System.out.println("\nSEARCH DOCUMENT");
                    System.out.println("Enter a : Search book");
                    System.out.println("Enter b : Search magazine");
                    System.out.println("Enter c : Delete newspaper");
                    System.out.print("Enter your choice : ");
                    String category = sc.nextLine();

                    switch (category) {
                        case "a" : {
                            doc_manager.searchByBook();
                            break;
                        }

                        case "b" : {
                            doc_manager.searchByMagazine();
                            break;
                        }

                        case "c" : {
                            doc_manager.searchByNewspaper();
                            break;
                        }

                        default :
                            System.out.println("Invalid input !!!");
                            break;
                    }
                    break;

                }

                case "5" : 
                    return;

                    default :
                    System.out.println("Invalid input !!!");
                    continue;
            }
            sc.close();
        }
    }
}