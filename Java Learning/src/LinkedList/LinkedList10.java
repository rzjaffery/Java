package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList10 {
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


//        Write a Java program that swaps two elements in a linked list.


        System.out.println("Before swapping ");
        System.out.println("Color list" + str1);
        System.out.println("Number List" + num1);

        Collections.swap(str1,0,2);
        Collections.swap(num1,1,3);


        System.out.println("After swapping ");
        System.out.println("Color list" + str1);
        System.out.println("Number List" + num1);

//        Write a Java program to shuffle elements in a linked list.


        System.out.println("Before Shuffling ");
        System.out.println("Color list" + str1);
        System.out.println("Number List" + num1);

        Collections.shuffle(str1);
        Collections.shuffle(num1);


        System.out.println("After Shuffling ");
        System.out.println("Color list" + str1);
        System.out.println("Number List" + num1);

    }
}
