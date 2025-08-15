package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
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

        //  Write a Java program to iterate through all elements in a linked list starting at the specified position.

        Iterator p = num1.listIterator(1);
        Iterator s = str1.listIterator(1);
//  Printing Linked Lists
        System.out.println("Colors List ");
        while (s.hasNext()) {
            System.out.println(s.next());
        }

        System.out.println("Number List ");
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
