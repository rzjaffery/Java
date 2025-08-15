package MethodsExamples;

import java.util.Scanner;

public class mth2 {
    public static void main(String[] args) {
//        2. Compute Average of Three Numbers

        int a, b, c;
        int avg = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers to find the average ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        avg = (a + b + c) / 3;
        System.out.println("Average of " + a + ", " + b + " & " + c + " is " + avg);
    }
}
