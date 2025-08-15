package MethodsExamples;

import java.util.Scanner;

public class mth4 {
    public static void main(String[] args) {
//        4. Count Vowels in String

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String ");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ||
            str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
            ) {
                count++;
            }
        }
        System.out.println("Vowels in the sentence are : " + count);
    }
}
