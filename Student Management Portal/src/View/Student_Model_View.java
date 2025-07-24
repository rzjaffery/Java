package View;

import Student.Display_Student;
import Student.Course_Selection_Student;

import static Model.Student_Model.scanner;

public class Student_Model_View {



    public Student_Model_View (String n, int a, int sID, String addr, int bNum, int smt, String dgr) {
        super ();
    }

    public static void main (String[] args) {
        Course_Selection_Student css = new Course_Selection_Student ();

        System.out.println ("=== Student Portal ===");

        int choice;
        do {
            System.out.println ("\nSelect from the options below:");
            System.out.println ("1) Transcript");
            System.out.println ("2) NAN Attendance");
            System.out.println ("3) Courses Selection");
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
                case 1 -> GPA_Calculation_View.main (new String[]{});
//                case 2 -> css.showAttendance ();
                case 3 -> css.selectCoursesbyStd ();
                case 4 -> Display_Student.verification ();
                case 0 -> System.out.println ("Exiting Student Portal...");
                default -> System.out.println ("Invalid option. Please try again.");
            }
        } while (choice != 0);
    }
}
