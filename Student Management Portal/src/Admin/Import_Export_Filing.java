package Admin;

import Model.Student_Model;
import Model.Teacher_Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Import_Export_Filing {

    public void exportStudentToFile (Student_Model s) {

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        String filename = "student.txt";

        File file = new File (path, filename);
        try {
            FileWriter writer = new FileWriter (file, true); // 'true' enables append mode
            writer.write ("Student ID: " + s.getStdID () +
                    ", Name: " + s.getName () +
                    ", Age: " + s.getAge () +
                    ", Address: " + s.getAddress () +
                    ", Batch: " + s.getBatchNum () +
                    ", Semester: " + s.getSemester () +
                    ", Degree: " + s.getDegree () + "\n");
            writer.close ();
            System.out.println ("Student record written to file.");
        } catch (IOException e) {
            System.out.println ("An error occurred while writing student to file: " + e.getMessage ());
        }
    }

    public void exportTeacherToFile (Teacher_Model t) {

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        String filename = "teacher.txt";

        File file = new File (path, filename);
        try {
            FileWriter writer = new FileWriter (file, true); // 'true' enables append mode
            writer.write ("Teacher ID: " + t.getTeaID () +
                    ", Name: " + t.getName () +
                    ", Age: " + t.getAge () +
                    ", Address: " + t.getAddress () +
                    ", Field of Study: " + t.getStudyField () + "\n");
            writer.close ();
            System.out.println ("Teacher record written to file.");
        } catch (IOException e) {
            System.out.println ("An error occurred while writing teacher data to file: " + e.getMessage ());
        }
    }

    public void importStudentfromFile () {

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        String filename = "student.txt";

        File file = new File (path, filename);
        if (!file.exists ()) {
            System.out.println ("File does not exist, Create a file from admin filing menu ");
            return;
        }
        try (Scanner filescanner = new Scanner (file)) {
            System.out.println ("All Students from the file ");
            int count = 1;
            while (filescanner.hasNextLine ()) {
                String line = filescanner.nextLine ();
                System.out.println (count++ + ") " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println ("Error reading student records: " + e.getMessage ());
        }
    }

    public void importTeacherfromFile () {
        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        String filename = "teacher.txt";

        File file = new File (path, filename);

        if (!file.exists ()) {
            System.out.println ("File does not exist, Create a file from admin filing menu ");
            return;
        }
        try (Scanner filescanner = new Scanner (file)) {
            System.out.println ("All Teacher from the file ");
            int count = 1;
            while (filescanner.hasNextLine ()) {
                String line = filescanner.nextLine ();
                System.out.println (count++ + ") " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println ("Error reading student records: " + e.getMessage ());
        }
    }
}
