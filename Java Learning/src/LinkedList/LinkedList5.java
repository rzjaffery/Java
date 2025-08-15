package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>();
        List<Integer> num1 = new LinkedList<>();

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

//        Write a Java program to insert the specified element at the specified position in the linked list.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the content you want to add");
        String ch = scanner.nextLine();
        System.out.println("Enter the number where you want to add");
        int ind = scanner.nextInt();

        System.out.println("Enter the number you want to add");
        int nm = scanner.nextInt();
        System.out.println("Enter the number where you want to add");
        int indnm = scanner.nextInt();

        str1.add(ind,ch);
        num1.add(indnm,nm);
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
