package Student;

import java.util.List;

public class GPA_Calculation {


    public boolean isValidGrade (String grade) {
        return grade.matches ("A\\+?|A-|B\\+|B|B-|C\\+|C|C-|D\\+|D|F");
    }


    public void showTranscript (List<String> Courses, List<String> Grade) {
        System.out.println ("================Transcript===============");

        System.out.println ("Course Name \t Grade");
        for (int i = 0; i < Courses.size (); i++) {
            System.out.println (Courses.get (i) + "\t\t\t" + Grade.get (i));
        }
    }

    public void calculateGPA (List<String> grade, List<Integer> creditHours) {

        double totalPoints = 0;
        int totalCrhrs = 0;

        for (int i = 0; i < grade.size (); i++) {
            double gradevalue = gradeValue (grade.get (i));
            int crhr = creditHours.get (i);

            totalPoints += gradevalue * crhr;
            totalCrhrs += crhr;

        }
        double sgpa = totalPoints / totalCrhrs;

        System.out.printf ("Total Credit Hours: %d\n", totalCrhrs);
        System.out.printf ("SGPA: %.2f\n", sgpa);
        System.out.printf ("CGPA: %.2f\n", sgpa);
    }

    /*
    * List of Common GPA Conversions
        Letter Grade	Percent Grade	4.0 GPA Scale
            A+          	97–100	        4.0
            A	            93–96	        4.0
            A-	            90–92	        3.7
            B+	            87–89	        3.3
            B	            83–86	        3.0
            B-	            80–82	        2.7
            C+	            77–79	        2.3
            C	            73–76	        2.0
            C-	            70–72	        1.7
            D+	            67–69	        1.3
            D	            65–66	        1.0
            F	            Below 65	    0.0
    *
    * */

    private static double gradeValue (String grade) {
        double grvalue = 0;
        if (grade.equals ("A") || grade.equals ("A+")) grvalue = 4.00;
        else if (grade.equals ("A-")) grvalue = 3.70;
        else if (grade.equals ("B+")) grvalue = 3.30;
        else if (grade.equals ("B")) grvalue = 3.00;
        else if (grade.equals ("B-")) grvalue = 2.70;
        else if (grade.equals ("C+")) grvalue = 2.30;
        else if (grade.equals ("C")) grvalue = 2.00;
        else if (grade.equals ("C-")) grvalue = 1.70;
        else if (grade.equals ("D+")) grvalue = 1.30;
        else if (grade.equals ("D")) grvalue = 1.00;
        else if (grade.equals ("F")) grvalue = 0.00;

        return grvalue;
    }


}
