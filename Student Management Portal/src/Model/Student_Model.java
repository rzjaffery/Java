package Model;

import java.util.HashMap;
import java.util.Scanner;

import static Admin.Courses.allCourses;

public class Student_Model {
    public static Scanner scanner = new Scanner (System.in);
    protected static final HashMap<String, HashMap<String, String>> courseSelect = new HashMap<> (allCourses);

    static int stdID;
    static String address;
    static int batchNum;
    static int semester;
    static String degree;

    public Student_Model (String n, int a, int sID, String addr, int bNum, int smt, String dgr) {
        stdID = sID;
        address = addr;
        batchNum = bNum;
        semester = smt;
        degree = dgr;
    }

    public int getStdID () {
        return stdID;
    }

    public int getBatchNum () {
        return batchNum;
    }

    public int getSemester () {
        return semester;
    }

    public String getAddress () {
        return address;
    }

    public String getDegree () {
        return degree;
    }

}
