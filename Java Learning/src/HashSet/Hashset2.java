package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 {
    public static void main(String[] args) {

        HashSet<String> sHash = new HashSet<String>();
        HashSet<Integer> nHash = new HashSet<Integer>();

        sHash.add("Ali");
        sHash.add("Ahmed");
        sHash.add("Rayyan");
        sHash.add("Sara");
        sHash.add("Ali");

        nHash.add(10);
        nHash.add(15);
        nHash.add(20);
        nHash.add(25);
        nHash.add(10);

        System.out.println("String HashSet: " + sHash);
        System.out.println("Number HashSet: " + nHash);

//        Write a Java program to iterate through all elements in a hash list.

        System.out.println("String Iteration");
        Iterator<String> stringIterator = sHash.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println("Number Iteration");
        Iterator<Integer> integerIterator = nHash.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
