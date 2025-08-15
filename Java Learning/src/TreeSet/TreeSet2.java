package TreeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {

        TreeSet<String> str1 = new TreeSet<>();
        TreeSet<Integer> num1 = new TreeSet<>();

        str1.add("Red");
        str1.add("Blue");
        str1.add("Yellow");
        str1.add("Green");
        str1.add("White");

        num1.add(20);
        num1.add(10);
        num1.add(50);
        num1.add(40);
        num1.add(80);

//        Write a Java program to iterate through all elements in a tree set.

        Iterator strIterator = str1.iterator();
        Iterator numIterator = num1.iterator();

        System.out.println("Forward Iteration ");
        while (strIterator.hasNext()){
            System.out.println(strIterator.next());
        }
        while (numIterator.hasNext()){
            System.out.println(numIterator.next());
        }

//        Write a Java program to create a reverse order view of the elements contained in a given tree set.

        Iterator strIt = str1.descendingIterator();
        Iterator numIt = num1.descendingIterator();

        System.out.println("Reverse Iteration ");
        while (strIt.hasNext()){
            System.out.println(strIt.next());
        }
        while (numIt.hasNext()){
            System.out.println(numIt.next());
        }
    }
}
