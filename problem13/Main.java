package problem13;

import java.util.Scanner;

import problem13.entity.Employee;
import problem13.entity.Experience;
import problem13.entity.Fresher;
import problem13.entity.Intern;
import problem13.manager.Management;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Management management = new Management();

        while (true) {
            System.out.println("\nEMPLOYEE MANAGEMENT");
            System.out.println("- Enter 1: Insert a new employee");
            System.out.println("- Enter 2: Update employee (by ID)");
            System.out.println("- Enter 3: Delete employee (by ID)");
            System.out.println("- Enter 4: Find all employees (by EmployeeType)");
            System.out.println("- Enter 5: Exit");
            System.out.print("Your choice: ");
            String choice;
            choice = sc.nextLine();
    
            switch (choice) {
                case "1":
                    System.out.println("\n1: INSERT NEW EMPLOYEE");
                    System.out.print("   - Enter Full Name: ");
                    String fullName = sc.nextLine();
                    System.out.print("   - Enter Birthday: (dd/mm/yyyy): ");
                    String doB = sc.nextLine();
                    System.out.print("   - Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("   - Enter Phone Number: ");
                    String phoneNum = sc.nextLine();
                    System.out.println("   - Enter the Employee Type: ");
                    System.out.println("\t+ Enter a: Experience");
                    System.out.println("\t+ Enter b: Fresher");
                    System.out.println("\t+ Enter c: Intern");
                    System.out.print("\tYour choice: ");
                    String choice1 = sc.nextLine();
                    switch (choice1) {
                        case "a":
                            System.out.print("\t+ Enter experience time (years): ");
                            int expInYear = sc.nextInt();
                            sc.nextLine();
                            System.out.print("\t+ Enter advanced skill: ");
                            String proSkill = sc.nextLine();
                            
                            Experience newExpEmployee = new Experience("123",fullName, doB, phoneNum, email, 1, null, expInYear, proSkill);
                            management.addEmployee(newExpEmployee);
                            System.out.println("EMPLOYEE ADDED SUCCESSFULLY!");
                            break;

                        case "b":
                            System.out.print("\t+ Enter graduation date: ");
                            String graduationDate = sc.nextLine();
                            System.out.print("\t+ Enter graduation rank: ");
                            String graduationRank = sc.nextLine();
                            System.out.print("\t+ Enter education: ");
                            String education = sc.nextLine();

                            Fresher newFrsEmployee = new Fresher("123", fullName, doB, phoneNum, email, 2, null, graduationDate, graduationRank, education);
                            management.addEmployee(newFrsEmployee);
                            System.out.println("EMPLOYEE ADDED SUCCESSFULLY!");

                            break;

                        case "c":
                            System.out.print("\t+ Enter majors: ");
                            String major = sc.nextLine();
                            System.out.print("\t+ Enter semester: ");
                            int semester = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter university: ");
                            String uniName = sc.nextLine();

                            Intern newItnEmployee = new Intern("123", fullName, doB, phoneNum, email, 3, null, major, semester, uniName);
                            management.addEmployee(newItnEmployee);
                            System.out.println("EMPLOYEE ADDED SUCCESSFULLY!");

                            break;

                        default:
                            System.out.println("INVALID INPUT EMPLOYEE TYPE!!!");
                            break;
                    }
                    break;
    
                case "2":
                    System.out.println("\n2: UPDATE EMPLOYEE BY ID");
                    System.out.print("   - Enter Employee ID: ");
                    String idUpdate = sc.nextLine();

                    Employee employeeUpdate = management.findEmployeeByID(idUpdate);
                    if (employeeUpdate == null) {
                        System.out.println("CANNOT FOUND!!!");
                    } else {
                        System.out.print("   - Enter Full Name: ");
                        String fullNameUpdate = sc.nextLine();
                        System.out.print("   - Enter Birthday (dd/mm/yyyy): ");
                        String doBUpdate = sc.nextLine();
                        System.out.print("   - Enter Email: ");
                        String emailUpdate = sc.nextLine();
                        System.out.print("   - Enter Phone Number: ");
                        String phoneNumUpdate = sc.nextLine();
                        
                        employeeUpdate.setFullName(fullNameUpdate);
                        employeeUpdate.setDOB(doBUpdate);
                        employeeUpdate.setEmail(emailUpdate);
                        employeeUpdate.setPhoneNum(phoneNumUpdate);
                        management.updateEmployee(idUpdate, employeeUpdate);

                        System.out.println("EMPLOYEE UPDATED SUCCESSFUL!");
                    }
                    break;
    
                case "3":
                    System.out.println("\n3: DELETE EMPLOYEE BY ID");
                    System.out.print("   - Enter EmployeeID");
                    String idDelete = sc.nextLine();

                    if (management.deleteEmployee(idDelete)) {
                        System.out.println("EMPLOYEE DELETED SUCCESSFULLY!");
                    } else {
                        System.out.println("CANNOT FOUND!!!");
                    }
    
                    break;
    
                case "4":
                    System.out.println("4: FIND ALL EMPLOYEES BY EMPLOYEE TYPE");
                    System.out.println("   - Enter a: Find all Experiences");
                    System.out.println("   - Enter b: Find all Freshers");
                    System.out.println("   - Enter c: Find all Interns");
                    System.out.print("   Your choice: ");
                    String choice4 = sc.nextLine();

                    switch (choice4) {
                        case "a":
                            System.out.println("   LIST OF EXPERIENCES: ");
                            for (Experience experience : management.findExperience()) {
                                System.out.print("\t+");
                                experience.showInfor();
                            }

                            break;

                        case "b":
                            System.out.println("   LIST OF FRESHERS: ");
                            for (Fresher fresher : management.findFresher()) {
                                System.out.print("\t+");
                                fresher.showInfor();
                            }

                            break;

                        case "c":
                            System.out.println("   LIST OF INTERNS:");
                            for (Intern intern : management.findIntern()) {
                                System.out.print("\t+");
                                intern.showInfor();
                            }

                            break;
                    }
    
                    break;
    
                case "5":
                    System.out.println("\nTHANK YOU!\n");
                    return;
    
                default:
                    System.out.println("INVALID INPUT!!!");
                    break;                
            }
        }
    }
}