package MethodsExamples;

import java.util.Scanner;

public class mth6 {
    public static void main(String[] args) {
//        6. Sum of Digits in Integer

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int num = scanner.nextInt();
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        System.out.print("Sum of Digits is " + result);

    }
}
