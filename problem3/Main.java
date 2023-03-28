package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Enrollment candidate_list = new Enrollment();

        while (true) {
            System.out.println("\nCANDIDATE ENROLLMENT MANAGEMENT");
            System.out.println("Enter 1 : Insert new candidate");
            System.out.println("Enter 2 : Show candidate information");
            System.out.println("Enter 3 : Search candidate - by Candidate ID");
            System.out.println("Enter 4 : Exit");
            System.out.print("Enter your choice : ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1" : {
                    System.out.println("\nINSERT NEW CANDIDATE");
                    System.out.print("Enter candidate name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter candidate ID : ");
                    int canID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter candidate address : ");
                    String address = sc.nextLine();
                    System.out.print("Enter candidate priority : ");
                    String priority = sc.nextLine();
                    System.out.print("Enter candidate block : ");
                    String block = sc.nextLine();
                    
                    switch (block) {
                        case "A" : {
                            CandidateA candidateA = new CandidateA(canID, name, address, priority);
                            System.out.println(candidateA.toString());
                            candidate_list.insertCandidate(candidateA);
                            break;
                        }
                        case "B" : {
                            CandidateB candidateB = new CandidateB(canID, name, address, priority);
                            System.out.println(candidateB.toString());
                            candidate_list.insertCandidate(candidateB);
                            break;
                        }
                        case "C" : {
                            CandidateC candidateC = new CandidateC(canID, name, address, priority);
                            System.out.println(candidateC.toString());
                            candidate_list.insertCandidate(candidateC);
                            break;
                        }
                    }

                    break;
                }

                case "2" : {
                    System.out.println("\nSHOW ALL CANDIDATE INFORMATION");
                    candidate_list.showCandidateInfor();
                    break;
                }

                case "3" : {
                    System.out.println("\nSEARCH CANDIDATE BY ID");
                    System.out.print("Enter the candidate ID : ");
                    int canID = sc.nextInt();
                    sc.nextLine();
                    System.out.println(candidate_list.searchCandidate(canID));
                    break;
                }

                case "4" : {
                    return;
                }

                default : 
                    System.out.println("Invalid input !!!");
                    sc.close();
                }
        }
        
    }
}
