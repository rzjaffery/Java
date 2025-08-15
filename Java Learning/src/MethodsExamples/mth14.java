package MethodsExamples;

import java.util.Scanner;

public class mth14 {
    //    14. Calculate Pentagon Area
    public static double pentagon_area(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of sides ");
        int num = scanner.nextInt();
        System.out.println("Input the sides ");
        double sides = scanner.nextDouble();

        System.out.println("Area of the pentagon = " + pentagon_area(num, sides));
    }
}
