package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors = new HashMap<>();

        colors.put(1,"Red");
        colors.put(2,"Blue");
        colors.put(3,"Green");
        colors.put(4,"Yellow");
        colors.put(5,"Black");
        colors.put(6,"White");

//        Write a Java program to get a shallow copy of a HashMap instance.

        HashMap<Integer,String> colorsCopy = new HashMap<>();

        colorsCopy = (HashMap) colors.clone();
        System.out.println(colorsCopy);

        
    }
}
