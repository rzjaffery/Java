package View;

import Admin.Courses;

import static Admin.Courses.scanner;

public class Courses_View {
    public static void main (String[] args) {
        Courses crs = new Courses ();
        crs.initializeCourses ();
        crs.writeCoursesinFile ();
        System.out.print ("Course Selection \n");
        System.out.print ("Select Department name (CS, EE, AI ... ) ");
        String deptname = scanner.nextLine ();
        crs.showCourses (deptname);


//        System.out.println("All Available Courses by Department:");
//        for (String dept : allCourses.keySet()) {
//            System.out.println("\nDepartment: " + dept);
//            showCourses(dept);
//        }
    }
}
