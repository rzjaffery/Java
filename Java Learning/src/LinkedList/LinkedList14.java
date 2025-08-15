package LinkedList;

import java.util.LinkedList;

public class LinkedList14 {
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>();
        LinkedList<Integer> num1 = new LinkedList<>();
        LinkedList <String> str2 = new LinkedList <> ();

        str1.addFirst("Blue");
        str1.add("Yellow");
        str1.add("Red");
        str1.add("Green");
        str1.add("White");

        str2.add("Yellow");
        str2.add("Black");
        str2.add("Grey");
        str2.add("Purple");
        str2.add("Brown");

        num1.addFirst(10);
        num1.add(15);
        num1.add(20);
        num1.add(25);
        num1.add(30);


//        Write a Java program to compare two linked lists.
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : str1)
            c3.add(str2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

//        Write a Java program to check if a linked list is empty or not.
        System.out.println("Original linked list: " + str1);
        System.out.println("Check the above linked list is empty or not! "+str1.isEmpty());
        str1.clear();
        System.out.println("Linked list after remove all elements "+str1);
        System.out.println("Check the above linked list is empty or not! "+str1.isEmpty());

    }
}
