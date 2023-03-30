package JLab01;

import java.util.Scanner;

public class Validation {
    private final static Scanner sc = new Scanner(System.in);

    public static int chechInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            }
            catch (NumberFormatException e) {
                System.err.println("Your input should be in range ["+min+","+max+"]");
                System.out.print("Enter again : ");
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            else {
                System.err.println("Your input should be Y/y or N/n");
                System.out.print("Enter again : ");
            }
        }
    }

}