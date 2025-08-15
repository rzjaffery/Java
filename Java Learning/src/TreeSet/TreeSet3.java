package TreeSet;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
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
        num1.add(80);
        num1.add(120);

//        Write a Java program to get the first and last elements in a tree set.

        System.out.println("First Element of String Tree Set " + str1.first());
        System.out.println("Last Element of String Tree Set " + str1.last());

        System.out.println("First Element of Number Tree Set " + num1.first());
        System.out.println("Last Element of Number Tree Set " + num1.last());

//        Write a Java program to get the number of elements in a tree set

        System.out.println("Size of String Tree Set "+ str1.size());
        System.out.println("Size of Number Tree Set " + num1.size());
    }
}
