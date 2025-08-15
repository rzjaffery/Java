package MethodsExamples;

import java.util.Scanner;


public class mth11 {

    public static final int PASSWORD_LENGTH = 8;

    //    11. Validate Password
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Password rules:\n" +
                "A password must have at least ten characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits.");
        System.out.println("Enter the Password");
        String password = scanner.nextLine();
        System.out.println(is_Valid_Password(password));

    }
}
