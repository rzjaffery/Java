package LinkedList;

import java.util.LinkedList;

public class LinkedList8 {
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>();
        LinkedList<Integer> num1 = new LinkedList<>();

        str1.addFirst("Blue");
        str1.add("Yellow");
        str1.add("Red");
        str1.add("Green");
        str1.add("White");

        num1.addFirst(10);
        num1.add(15);
        num1.add(20);
        num1.add(25);
        num1.add(30);


//        Write a Java program to get the first and last occurrence of the specified elements in a linked list.

        System.out.println("First occurrence: " + str1.getFirst() );
        System.out.println("Last occurrence: " + str1.getLast());
        System.out.println("First occurrence: " + num1.getFirst());
        System.out.println("Last occurrence: " + num1.getLast());

//        Write a Java program to display elements and their positions in a linked list.
        System.out.println("Color List");
        for (int i = 0; i < str1.size(); i++) {
            System.out.println("Element at " + i + " is " + str1.get(i));
        }

        System.out.println("Number List");
        for (int i = 0; i < num1.size(); i++) {
            System.out.println("Element at " + i + " is " + num1.get(i));
        }

    }
}
