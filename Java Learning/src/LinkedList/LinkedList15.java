package LinkedList;

import java.util.LinkedList;

public class LinkedList15 {
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


//        Write a Java program to replace an element in a linked list.

        str1.set(1, "Orange");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + str1);
    }
}
