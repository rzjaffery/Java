package TreeSet;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
//        Write a Java program to create a tree set, add some colors (strings) and print out the tree set.

        TreeSet<String> str1 = new TreeSet<>();
        TreeSet<Integer> num1 = new TreeSet<>();

        str1.add("Red");
        str1.add("Blue");
        str1.add("Yellow");
        str1.add("Green");
        str1.add("White");

        num1.add(20);
        num1.add(10);
        num1.add(50);
        num1.add(40);
        num1.add(80);

        System.out.println("Printing of TreeSet for Strings & Numbers");
        System.out.println("String Tree Set");
        for (String i : str1){
            System.out.println(i);
        }
        System.out.println("Number Tree Set");
        for (Integer i : num1){
            System.out.println(i);
        }
    }
}
