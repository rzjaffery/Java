package MethodsExamples;

import java.util.Scanner;

//      10. Check Leap Year
public class mth10 {
    public static boolean leapYear(int y) {
        boolean a = (y % 4 == 0);
        boolean b = (y % 100 != 0);
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if(leapYear(year))
            System.out.println(year + " is a leap year ");
        else
            System.out.println(year + " is not a leap year ");
    }
}
