package View;

import Assignment.Assignment_Generator;

import java.util.Scanner;


public class Assignment_Generator_View {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        Assignment_Generator ag = new Assignment_Generator ();

        while (true) {
            System.out.println ("\n========= Assignment Generator Menu =========");
            System.out.println ("1. Create Assignment");
            System.out.println ("2. Assignment Filing");
            System.out.println ("0. Exit");
            System.out.print ("Select an option: ");

            String choice = sc.nextLine ();

            switch (choice) {
                case "1" -> ag.createAssignment (sc);
                case "2" -> Question_Filing_View.main (new String[]{});
                case "0" -> {
                    System.out.println ("Exiting...");
                    return;
                }
                default -> System.out.println ("Invalid choice. Please try again.");
            }
        }
    }

}
