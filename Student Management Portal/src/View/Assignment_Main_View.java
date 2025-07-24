package View;

import Assignment.Assignment_Main;

import java.util.Scanner;

public class Assignment_Main_View {
    public static void main (String[] args) {
        Assignment_Main as = new Assignment_Main ();
        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println ("\n========= Assignment Generator Menu =========");
            System.out.println ("1. Create Assignment");
            System.out.println ("2. Edit Assignment");
            System.out.println ("3. Remove Assignment");
            System.out.println ("4. Assignment Filing");
            System.out.println ("0. Exit");
            System.out.print ("Select an option: ");

            String choice = sc.nextLine ();

            switch (choice) {
                case "1" -> as.createAssignment (sc);
                case "2" -> as.editAssignment (sc);
                case "3" -> as.removeAssignment (sc);
                case "4" -> Question_Filing_View.main (new String[]{});
                case "0" -> {
                    System.out.println ("Exiting...");
                    return;
                }
                default -> System.out.println ("Invalid choice. Please try again.");
            }
        }
    }
}
