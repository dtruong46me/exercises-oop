package problem1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerOfficier M_Officier = new ManagerOfficier();
        while (true) {
            System.out.println("----------.----------");
            System.out.println("Application Manager Officier");
            System.out.println("Enter 1 : To Insert Officier");
            System.out.println("Enter 2 : To Search Officier By Name");
            System.out.println("Enter 3 : To Show Officiers' Information");
            System.out.println("Enter 4 : To Exit");

            String input = sc.nextLine();

            switch (input) {
                // ------Insert Officier------
                case "1": {
                    System.out.println("------Insert Officier------");
                    System.out.println("Enter a : To Insert Engineer");
                    System.out.println("Enter b : To Insert Worker");
                    System.out.println("Enter c : To Insert Staff");

                    String input_1 = sc.nextLine();

                    switch (input_1) {
                        //------Insert Engineer------
                        case "a": { 
                            System.out.println("------Insert Engineer------");
                            System.out.print("Enter name    : ");
                            String name = sc.nextLine();
                            System.out.print("Enter age     : ");
                            int age = sc.nextInt();
                            System.out.print("Enger gender  : ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("Enter address : ");
                            String address = sc.nextLine();
                            System.out.print("Enter branch  : ");
                            String branch = sc.nextLine();

                            Officier engineer = new Engineer(name, age, gender, address, branch);
                            M_Officier.AddOfficier(engineer);
                            System.out.println(engineer.toString());
                            break;
                        }

                        //------Insert Worker------
                        case "b": {
                            System.out.println("------Insert Worker------");
                            System.out.print("Enter name    : ");
                            String name = sc.nextLine();
                            System.out.print("Enter age     : ");
                            int age = sc.nextInt();
                            System.out.print("Enger gender  : ");
                            String gender = sc.nextLine();
                            System.out.print("Enter address : ");
                            String address = sc.nextLine();
                            System.out.print("Enter level   : ");
                            int level = sc.nextInt();

                            Officier worker = new Worker(name, age, gender, address, level);
                            M_Officier.AddOfficier(worker);
                            System.out.println(worker.toString());
                            break;
                        }

                        //------Insert Staff------
                        case "c": {
                            System.out.println("------Insert Staff------");
                            System.out.print("Enter name    : ");
                            String name = sc.nextLine();
                            System.out.print("Enter age     : ");
                            int age = sc.nextInt();
                            System.out.print("Enger gender  : ");
                            String gender = sc.nextLine();
                            System.out.print("Enter address : ");
                            String address = sc.nextLine();
                            System.out.print("Enter task    : ");
                            String task = sc.nextLine();
                            
                            Officier staff = new Staff(name, age, gender, address, task);
                            M_Officier.AddOfficier(staff);
                            System.out.println(staff.toString());
                        }

                        sc.close();

                        default:
                            System.out.println("Invalid!");
                            break;
                    }
                    break;
                }


                case "2": {
                    System.out.print("Enter name to search : ");
                    String name = sc.nextLine();
                    M_Officier.SearchOfficier(name).forEach(officier -> {
                        System.out.println(officier.toString());
                    });
                    break;
                }


                case "3": {
                    M_Officier.ShowInforOfficier();
                    break;
                }


                case "4": {
                    return;
                }


                default:
                    System.out.println("Invalid");
                    continue;
            } 

        }
    }
}