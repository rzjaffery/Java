package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors = new HashMap<>();
        HashMap<Integer,String> colors2 = new HashMap<>();

        colors.put(1,"Red");
        colors.put(2,"Blue");
        colors.put(3,"Green");
        colors.put(4,"Yellow");
        colors.put(5,"Black");
        colors.put(6,"White");




//        Write a Java program to associate the specified value with the specified key in a HashMap.

        for (Map.Entry x : colors.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

//        Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println("HashMap size " + colors.size());


//        Write a Java program to remove all mappings from a map.

        System.out.println("IS Colors Hashmap empty " + colors.isEmpty());
        System.out.println("Colors hashmap before clearing "+ colors);
        colors.clear();
        System.out.println("Colors hashmap after clearing "+ colors);

//        Write a Java program to check whether a map contains key-value mappings (empty) or not.

        System.out.println("IS Colors Hashmap empty " + colors.isEmpty());
    }
}
