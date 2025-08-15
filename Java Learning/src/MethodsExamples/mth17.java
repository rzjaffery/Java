package MethodsExamples;

import java.util.Scanner;

public class mth17 {
//    17. Count Occurrences of Digit '2' in Integer

    public static int occDigit(int n) {
        int count = 0;
        int num = n;
        do {
            if (num % 10 == 2) {
                count++;
            }
            num /= 10;
        } while (num > 0);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        System.out.println("Digit occurrence was: " + occDigit(num));
    }
}
