package Admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Courses {
    public static Scanner scanner = new Scanner (System.in);
    public static final HashMap<String, HashMap<String, String>> allCourses = new HashMap<> ();



    public  void initializeCourses() {
        CScourses ();
        AIcourses ();
        EEcourses ();
        FTcourses ();
    }

    public  void writeCoursesinFile() {

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        String filename = "courses.txt";

        File courseFile = new File (path, filename);
        try (FileWriter writer = new FileWriter(courseFile, true)) {
            writer.write("=== Courses List ===\n");

            for (String dept : allCourses.keySet()) {
                writer.write("\nDepartment: " + dept + "\n");

                HashMap<String, String> deptCourses = allCourses.get(dept);
                for (String courseCode : deptCourses.keySet()) {
                    String courseName = deptCourses.get(courseCode);
                    writer.write("  - " + courseCode + ": " + courseName + "\n");
                }
            }

            writer.write("\n=====================\n\n");

            System.out.println("Courses successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing courses to file: " + e.getMessage());
        }
    }



    public void showCourses(String dept) {
        HashMap<String, String> deptCourses = allCourses.get (dept.toUpperCase ());
        if (deptCourses == null) {
            System.out.println ("No courses found for department: " + dept);
            return;
        }

        System.out.println (dept + " Department Courses:");
        for (String code : deptCourses.keySet ()) {
            System.out.println (code + ": " + deptCourses.get (code));
        }
    }


    private static void FTcourses() {
        HashMap<String, String> ft = new HashMap<> ();
        ft.put ("FT1001", "Introduction to Food Science");
        ft.put ("FT1002", "Food Chemistry");
        ft.put ("FT2001", "Food Microbiology");
        ft.put ("FT2002", "Nutrition and Dietetics");
        ft.put ("FT3001", "Food Processing");
        ft.put ("FT3002", "Food Engineering");
        ft.put ("FT3003", "Food Quality Control");
        ft.put ("FT4001", "Food Safety and Regulations");
        ft.put ("FT4002", "Food Packaging");
        ft.put ("FT4003", "Functional Foods");

        allCourses.put ("FT", ft);
    }


    private static void AIcourses() {
        HashMap<String, String> ai = new HashMap<> ();
        ai.put ("AI1001", "Introduction to AI");
        ai.put ("AI1002", "Mathematics for AI");
        ai.put ("AI2001", "Machine Learning");
        ai.put ("AI2002", "Data Mining");
        ai.put ("AI3001", "Neural Networks");
        ai.put ("AI3002", "Computer Vision");
        ai.put ("AI4001", "Natural Language Processing");
        ai.put ("AI4002", "AI Ethics and Safety");
        ai.put ("AI4003", "Advanced Deep Learning");
        ai.put ("AI4004", "Reinforcement Learning");

        allCourses.put ("AI", ai);
    }

    private static void EEcourses() {
        HashMap<String, String> ee = new HashMap<> ();
        ee.put ("EE1001", "Basic Electrical Engineering");
        ee.put ("EE1002", "Circuit Analysis");
        ee.put ("EE2001", "Digital Logic Design");
        ee.put ("EE2002", "Signals and Systems");
        ee.put ("EE3001", "Microcontrollers");
        ee.put ("EE3002", "Control Systems");
        ee.put ("EE3003", "Embedded Systems");
        ee.put ("EE4001", "Power Electronics");
        ee.put ("EE4002", "Communication Systems");
        ee.put ("EE4003", "VLSI Design");

        allCourses.put ("EE", ee);
    }


    private static void CScourses() {
        HashMap<String, String> cs = new HashMap<> ();
        cs.put ("CS1001", "Programming Fundamentals");
        cs.put ("CS1002", "Discrete Structures");
        cs.put ("CS2001", "Data Structures");
        cs.put ("CS2003", "Object Oriented Programming");
        cs.put ("CS2004", "Computer Architecture");
        cs.put ("CS3001", "Operating Systems");
        cs.put ("CS3002", "Software Engineering");
        cs.put ("CS3003", "Database Systems");
        cs.put ("CS4001", "Artificial Intelligence");
        cs.put ("CS4002", "Compiler Construction");

        allCourses.put ("CS", cs);
    }

}
