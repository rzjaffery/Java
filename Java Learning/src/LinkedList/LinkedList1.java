package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedList1 {
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

//        Printing Linked Lists
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
