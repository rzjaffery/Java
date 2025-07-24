package View;

import Student.GPA_Calculation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GPA_Calculation_View {
    public static void main(String[] args) {
        GPA_Calculation gpa = new GPA_Calculation ();
        Scanner scanner = new Scanner (System.in);

        List<String> gradeList = new ArrayList<> ();
        List<Integer> credithrList = new ArrayList<> ();
        List<String> cNameList = new ArrayList<> ();

        int n;

        System.out.print ("GPA Calculation: \n");
        System.out.print ("Enter the number of Courses: ");
        n = scanner.nextInt ();
        scanner.nextLine ();

        for (int i = 0; i < n; i++) {
            String cname;
            String grade;
            int crhr;

            while (true) {
                System.out.print ("Course Name: ");
                cname = (scanner.nextLine ().toUpperCase ());
                if (!cname.isEmpty () && cname.matches ("[A-Z0-9\\s]+"))
                    break;
                else
                    System.out.print ("Invalid Course Name");
            }
            while (true) {
                System.out.print ("Grade: ");
                grade = scanner.nextLine ().trim ();
                if (gpa.isValidGrade (grade))
                    break;
                else
                    System.out.print ("Invalid Grade Entered ");
            }

            while (true) {
                System.out.print ("Credit Hours: ");
                if (scanner.hasNextInt ()) {
                    crhr = scanner.nextInt ();
                    scanner.nextLine ();
                    if (crhr > 0 && crhr <= 3) {
                        break;
                    } else {
                        System.out.println ("Credit hours should be between 1 and 3.");
                    }
                } else {
                    System.out.println ("Please enter a valid number.");
                    scanner.next ();
                }
            }

            cNameList.add (cname);
            gradeList.add (grade);
            credithrList.add (crhr);
        }

        gpa.showTranscript (cNameList, gradeList);
        gpa.calculateGPA (gradeList, credithrList);

    }
}
