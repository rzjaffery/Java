package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList6 {
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


//        Write a Java program to insert elements into the linked list at the first and last positions.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Color you want to add first in line");
        String col1 = scanner.nextLine();
        System.out.println("Enter the Color you want to add Last in line");
        String col2 = scanner.nextLine();

        System.out.println("Enter the number you want to add first in line");
        int nm1 = scanner.nextInt();
        System.out.println("Enter the number you want to add last in line");
        int nm2 = scanner.nextInt();

        str1.addFirst(col1);
        str1.addLast(col2);
        num1.addFirst(nm1);
        num1.addLast(nm2);
        System.out.println("Colors List ");
        for (String i: str1){
            System.out.println(i);
        }
        System.out.println("Number List ");
        for (int i: num1){
            System.out.println(i);
        }
    }
}
