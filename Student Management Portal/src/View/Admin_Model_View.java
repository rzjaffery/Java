package View;

import Model.Admin_Model;
import Model.Student_Model;
import Model.Teacher_Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Admin_Model_View {

    public static Scanner scanner = new Scanner (System.in);
    private static final ArrayList<Student_Model> STUDENT_MODELS = new ArrayList<> ();
    private static final ArrayList<Teacher_Model> TEACHER_MODELS = new ArrayList<> ();

    public static void main (String[] args) throws IOException {
        Admin_Model ad = new Admin_Model ();
        Admin_Filing_View af = new Admin_Filing_View ();
        while (true) {
            System.out.println ("\nAdmin Menu\n" +
                    "1) Add Student\n" +
                    "2) Delete Student\n" +
                    "3) Show All Students\n" +
                    "4) Add Teacher\n" +
                    "5) Delete Teacher\n" +
                    "6) Show All Teachers\n" +
                    "7) Admin Filing\n" +
                    "0) Exit");

            System.out.print ("Enter your choice: ");
            int choice = scanner.nextInt ();
            scanner.nextLine ();  // consume newline

            switch (choice) {
                case 1 -> ad.addStudent ();
                case 2 -> ad.deleteStudent ();
                case 3 -> ad.showAllStudents ();
                case 4 -> ad.addTeacher ();
                case 5 -> ad.deleteTeacher ();
                case 6 -> ad.showAllTeachers ();
                case 7 -> af.main (new String[]{});
                case 0 -> {
                    System.out.println ("Exiting...");
                    return;
                }
                default -> System.out.println ("Invalid choice!");
            }
        }
    }
}
