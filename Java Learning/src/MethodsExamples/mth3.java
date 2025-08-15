package MethodsExamples;

import java.util.Scanner;

public class mth3 {
    public static void main(String[] args) {
//        3. Find Middle Character(s) of String

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String ");
        String str = scanner.nextLine();
        int length, position;

        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        String result = str.substring(position, position + length);

        System.out.print("The middle value of the String is ");
        System.out.println(result);
    }
}
