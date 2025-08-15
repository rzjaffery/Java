package MethodsExamples;

import java.util.Scanner;

public class mth13 {

    //    13. Calculate Triangle Area
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double s = (a + b + c) / 2;
        double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));

        System.out.println("Area of Triangle with sides " + a + ", " + b + " & " + c + " is " + area);

    }
}
