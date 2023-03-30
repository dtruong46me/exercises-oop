package JLab01;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> student_list = new ArrayList<>();
        Validation validation = new Validation();

        int cnt = 0;

        while (true) {
            System.out.println("\nWHELCOME TO STUDENT MANAGEMENT");
            System.out.println("Enter 1 : Create student");
            System.out.println("Enter 2 : Find and sort student - by name");
            System.out.println("Enter 3 : Update/Delete student");
            System.out.println("Enter 4 : Display all students");
            System.out.println("Enter 5 : Exit");
            System.out.print("Enter your choice : ");

            int choice = validation.chechInputLimit(1, 5);

            switch (choice) {
                case 1 : {
                    if (cnt > 10) {
                        System.out.println("Do you want to continue (Y/N)?");
                        if (!validation.checkInputYN()) {
                            return;
                        }
                    }
                    break;
                }

                case 2 : {
                    break;
                }

                case 3 : {
                    break;
                }

                case 4 : {
                    break;
                }

                case 5 : {
                    return;
                }
            }

            sc.close();
        }
    }
}