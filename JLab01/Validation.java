package JLab01;

import java.util.Scanner;

public class Validation {
    private final static Scanner sc = new Scanner(System.in);

    // Check user input String
    public static String CheckInpString() {
        while (true) {
            String result = sc.nextLine().trim();

            if (result.isEmpty()) {
                System.err.println("Not Empty !!!");
                System.out.print("Enter again : ");
            }
            else {
                return result;
            }
        }
    }


    // Check user input Y/N
    public static boolean CheckInpYN() {
        while (true) {
            String result = CheckInpString();
            
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }

            if (result.equalsIgnoreCase("N")) {
                return false;
            }

            System.err.println("Please input Y/y or N/n.");
            System.out.print("Enter again : ");
        }
    }
}
