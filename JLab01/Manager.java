package JLab01;

import java.util.ArrayList;

public class Manager {
    
    // Show menu
    public void ShowMenu() {
        System.out.println("Enter 1 : Creat");
        System.out.println("Enter 2 : Find and Sort");
        System.out.println("Enter 3 : Update/Delete");
        System.out.println("Enter 4 : Report");
        System.out.println("Enter 5 : Exit");
    }

    // Creat a new student
    public void CreatStudent(int cnt, ArrayList<Student> student_list) {
        // If number of students greater than 10, ask user to continue or not
        if (cnt > 10) {
            System.out.print("Do you want to continue : ");
            if (!Validation.CheckInpYN()) {
                return;
            }
        }

        while (true) {
            
        }
    }

    // Find and Sort


    // List students by name


    // Update and Delete


    // Print report
}
