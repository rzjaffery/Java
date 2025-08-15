package LinkedList;

import java.util.LinkedList;

public class LinkedList12 {
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

//        Write a Java program to remove and return the first element of a linked list.
        System.out.println("Original linked  list: " + str1);
        System.out.println("Removed element: " + str1.pop());
        System.out.println("Linked list after pop operation: " + str1);
        System.out.println("Original linked  list: " + num1);
        System.out.println("Removed element: " + num1.pop());
        System.out.println("Linked list after pop operation: " + num1);

//        Write a Java program to retrieve, but not remove, the first element of a linked list.

        System.out.println("Original linked  list: " + str1);
        System.out.println("First element: "+str1.peekFirst());
        System.out.println("Linked list after peek operation: "+str1);

//        Write a Java program to retrieve, but not remove, the last element of a linked list.

        System.out.println("Original linked  list: " + str1);
        System.out.println("Last element: "+str1.peekLast());
        System.out.println("Linked list after peek operation: "+str1);

    }
}
