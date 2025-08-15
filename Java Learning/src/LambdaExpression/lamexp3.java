package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class lamexp3 {
    public static void main(String[] args) {
//        3. Convert strings to upper/lowercase using lambda

        List<String> stringList = Arrays.asList("Red","Blue","Green","Yellow");
        System.out.println(stringList);
        stringList.replaceAll(str -> str.toLowerCase());
        System.out.println("Lower Case List");
        for (Object str : stringList){
            System.out.println(str);
        }

        stringList.replaceAll(str -> str.toUpperCase());
        System.out.println("Upper Case List");
        for (Object str : stringList){
            System.out.println(str);
        }


    }
}
