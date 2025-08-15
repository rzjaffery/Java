package MethodsExamples;

import java.util.Scanner;

public class mth5 {
    public static void main(String[] args) {
//        5. Count Words in String
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence ");
        String str = scanner.nextLine();

        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' '){
                    count++;
                }
            }
            count++;
        }

        System.out.print("Total Words in the Sentence "+count);
    }
}
