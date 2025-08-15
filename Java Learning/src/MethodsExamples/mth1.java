package MethodsExamples;

import java.util.Scanner;

public class mth1 {
    public static void main(String[] args) {

//        1. Find Smallest Number Among Three

        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter 3 numbers ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is larger than " + b + " & " + c);
        } else if (b >= a && b >= c) {
            System.out.println(b + " is larger than " + a + " & " + c);
        } else {
            System.out.println(c + " is larger than " + a + " & " + b);
        }

    }
}
