package LinkedList;

import java.util.LinkedList;

public class LinkedList11 {
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>();
        LinkedList<Integer> num1 = new LinkedList<>();
        LinkedList <String> str2 = new LinkedList <> ();

        str1.addFirst("Blue");
        str1.add("Yellow");
        str1.add("Red");
        str1.add("Green");
        str1.add("White");

        str2.add("Maroon");
        str2.add("Black");
        str2.add("Grey");
        str2.add("Purple");
        str2.add("Brown");

        num1.addFirst(10);
        num1.add(15);
        num1.add(20);
        num1.add(25);
        num1.add(30);


//         Write a Java program to join two linked lists.

        LinkedList<String> res = new LinkedList<>();

        res.addAll(str1);
        res.addAll(str2);

        System.out.println("After adding all " + res);

//        Write a Java program to copy a linked list to another linked list.

        LinkedList<String> a = new LinkedList<String>();

        a = (LinkedList)str1.clone();
        System.out.println(a);



    }
}
