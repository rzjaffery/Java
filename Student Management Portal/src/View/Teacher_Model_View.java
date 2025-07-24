package View;

import Teacher.Display_Teacher;
import Model.Teacher_Model;

import java.util.Scanner;

public class Teacher_Model_View {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        Teacher_Model tch = new Teacher_Model ();
        Display_Teacher dis = new Display_Teacher ();

        System.out.println ("=== Student Portal ===");

        int choice;
        do {
            System.out.println ("\nSelect from the options below:");
            System.out.println ("1) NaN Transcript Portal");
            System.out.println ("2) NaN Attendance Portal");
            System.out.println ("3) Assignment Portal");
            System.out.println ("4) Display Info");
            System.out.println ("0) Exit");
            System.out.print ("Option: ");

            while (!scanner.hasNextInt ()) {
                System.out.print ("Please enter a valid number (1–5): ");
                scanner.next ();  // clear invalid input
            }

            choice = scanner.nextInt ();
            scanner.nextLine (); // consume newline

            switch (choice) {
//                case 1 -> editTranscript ();
//                case 2 -> editAttendance ();
                case 3 -> Assignment_Main_View.main (new String[]{});
                case 4 -> dis.verification ();
                case 0 -> System.out.println ("Exiting Student Portal...");
                default -> System.out.println ("Invalid option. Please try again.");
            }
        } while (choice != 0);
    }
}
