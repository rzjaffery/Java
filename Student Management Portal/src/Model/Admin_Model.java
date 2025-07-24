package Model;

import Admin.Import_Export_Filing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Admin_Model {
    public static Scanner scanner = new Scanner (System.in);
    Import_Export_Filing ief = new Import_Export_Filing ();
    private static final ArrayList<Student_Model> STUDENT_MODELS = new ArrayList<> ();
    private static final ArrayList<Teacher_Model> TEACHER_MODELS = new ArrayList<> ();

    public void showAllTeachers () {
        ief.importTeacherfromFile ();
    }

    public void deleteTeacher () {
        System.out.print ("Enter Teacher ID to remove the Teacher's Information");
        int teaID = scanner.nextInt ();
        TEACHER_MODELS.removeIf (Teacher_Model -> Teacher_Model.getTeaID () == teaID);
        System.out.println ("Teacher (ID: " + teaID + ") was removed from the database");
    }

    public void addTeacher () {
        System.out.println ("Enter Teacher Credentials");

        System.out.print ("Name: ");
        String name = scanner.nextLine ();

        System.out.print ("Teacher ID: ");
        int teaID = scanner.nextInt ();
        scanner.nextLine ();

        System.out.print ("Age: ");
        int age = scanner.nextInt ();
        scanner.nextLine ();

        System.out.print ("Address: ");
        String addr = scanner.nextLine ();

        System.out.print ("Field of Study: ");
        String fos = scanner.nextLine ();

        Teacher_Model t = new Teacher_Model ();
        TEACHER_MODELS.add (t);
        ief.exportTeacherToFile (t);
        System.out.println ("Teacher Information Added");
    }

    public void showAllStudents () {
        ief.importStudentfromFile ();

    }

    public void deleteStudent () {

        System.out.print ("Enter the Student ID to remove the information \n");
        int rollnum = scanner.nextInt ();

        STUDENT_MODELS.removeIf (student -> student.getStdID () == rollnum);
        System.out.println ("Student (ID: " + rollnum + ") was removed from the database");

    }

    public void addStudent () throws IOException {
        System.out.print ("Name: ");
        String name = scanner.nextLine ();

        System.out.print ("Student ID: ");
        int stdID = scanner.nextInt ();
        scanner.nextLine (); // consume leftover newline

        System.out.print ("Age: ");
        int age = scanner.nextInt ();
        scanner.nextLine ();

        System.out.print ("Address: ");
        String addr = scanner.nextLine ();

        System.out.print ("Batch Number: ");
        int bnum = scanner.nextInt ();
        scanner.nextLine ();

        System.out.print ("Semester: ");
        int smt = scanner.nextInt ();
        scanner.nextLine ();

        System.out.print ("Degree: ");
        String dgr = scanner.nextLine ();
        Student_Model s = new Student_Model (name, age, stdID, addr, bnum, smt, dgr);
        STUDENT_MODELS.add (s);
        ief.exportStudentToFile (s);


        System.out.println ("Student Information Added");
    }


}

