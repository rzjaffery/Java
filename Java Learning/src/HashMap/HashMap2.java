package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {

        HashMap<Integer,String> colors = new HashMap<>();
        HashMap<Integer,String> colors2 = new HashMap<>();

        colors.put(1,"Red");
        colors.put(2,"Blue");
        colors.put(3,"Green");
        colors.put(4,"Yellow");
        colors.put(5,"Black");
        colors.put(6,"White");

        colors2.put(1,"Red");
        colors2.put(2,"Blue");
        colors2.put(3,"Green");

        //        Write a Java program to copy all mappings from the specified map to another map.

        System.out.println("Colors2 HashMap");
        for (Map.Entry i : colors2.entrySet()){
            System.out.println(i);
        }
        System.out.println("Colors2 HashMap after copying");
        colors2.putAll(colors);
        for (Map.Entry i : colors2.entrySet()){
            System.out.println(i);
        }

    }
}
