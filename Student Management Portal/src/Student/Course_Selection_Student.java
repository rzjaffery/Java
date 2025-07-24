package Student;

import Admin.Courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static Admin.Courses.allCourses;
import static Model.Student_Model.scanner;

public class Course_Selection_Student {

    protected static List<String> selectedCourses = new ArrayList<> ();
    protected static int totalCreditHours = 0;


    public void selectCoursesbyStd () {
        Courses crs = new Courses ();
//        initializeCourses ();
        System.out.println ("Course Selection");

        while (true) {
            System.out.print ("Enter the Department name (CS, EE, AI, FT or 0 to finish): ");
            String deptname = scanner.nextLine ().toUpperCase ();

            if (deptname.equals ("0")) {
                break;
            }

            if (allCourses.containsKey (deptname)) {
                HashMap<String, String> deptCourses = allCourses.get (deptname);
                System.out.println ("\nAvailable Courses in " + deptname + " Department:");
                for (String code : deptCourses.keySet ()) {
                    System.out.println (code + ": " + deptCourses.get (code));
                }

                System.out.println ("Enter course codes to add (comma separated), or 'done' to go back:");
                String input = scanner.nextLine ();

                if (input.equalsIgnoreCase ("done")) {
                    continue;
                }

                String[] courseCodes = input.split (",");
                for (String codeRaw : courseCodes) {
                    String code = codeRaw.trim ().toUpperCase ();

                    if (!deptCourses.containsKey (code)) {
                        System.out.println ("Invalid course code: " + code);
                        continue;
                    }

                    if (selectedCourses.contains (code)) {
                        System.out.println ("Course already added: " + code);
                        continue;
                    }

                    if (totalCreditHours + 3 > 20) {
                        System.out.println ("Cannot add " + code + ". Credit hour limit (20) will be exceeded.");
                        continue;
                    }

                    selectedCourses.add (code);
                    crs.writeCoursesinFile ();
                    totalCreditHours += 3;
                    System.out.println ("Added: " + code + " - " + deptCourses.get (code));
                }

                System.out.println ("Total Credit Hours: " + totalCreditHours);
            } else {
                System.out.println ("Invalid department name.");
            }

        }

        System.out.println ("\nFinal Selected Courses:");
        for (String course : selectedCourses) {
            System.out.println ("- " + course);
        }
    }
}
