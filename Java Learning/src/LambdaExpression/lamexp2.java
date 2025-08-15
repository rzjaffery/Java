package LambdaExpression;

import java.util.function.Predicate;

public class lamexp2 {
    public static void main(String[] args) {
//        2. Check if a string is empty using lambda

        Predicate<String> isEmptyString = str -> str.isEmpty();

        String str1 = "";
        String str2 = "Rayyan Zafar";
        System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));
    }
}
