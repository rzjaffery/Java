package LinkedList;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class LinkedList9 {
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


//        Write a Java program to remove a specified element from a linked list.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Color to remove");
        Object rm1 = scanner.nextLine();
        str1.remove(rm1);
        System.out.println("Color list after removal of " + rm1);
        for (String i : str1) {
            System.out.println(i);
        }

        System.out.println("Enter the Number to remove");
        Object nm1 = scanner.nextInt();
        num1.remove(nm1);
        System.out.println("Number list after removal of " + nm1);
        for (int i : num1) {
            System.out.println(i);
        }

//        Write a Java program to remove the first and last elements from a linked list.

        System.out.println("Color list" + str1);
        System.out.println("Number List" + num1);

        System.out.println(str1.removeFirst());
        System.out.println(str1.removeLast());
        System.out.println(num1.removeFirst());
        System.out.println(num1.removeLast());

        System.out.println("Color list after removal" + str1);
        System.out.println("Number List after removal" + num1);


//        Write a Java program to remove all elements from a linked list.
        str1.clear();
        num1.clear();

        System.out.println("After removing everything from the list");
        System.out.println("Color list" + str1);
        System.out.println("Number List" + num1);


    }
}
