package HashSet;

import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
//        Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> sHash = new HashSet<String>();
        HashSet<Integer> nHash = new HashSet<Integer>();

        sHash.add("Ali");
        sHash.add("Ahmed");
        sHash.add("Rayyan");
        sHash.add("Sara");
        sHash.add("Sana");

        nHash.add(10);
        nHash.add(15);
        nHash.add(20);
        nHash.add(25);
        nHash.add(10);

        System.out.println("String HashSet: " + sHash);
        System.out.println("Number HashSet: " + nHash);

//        Write a Java program to get the number of elements in a hash set.

        System.out.println("Size of String HashSet: " + sHash.size());
        System.out.println("Size of Number HashSet: " + nHash.size());

//        Write a Java program to empty an hash set


        System.out.println("String HashSet: " + sHash);
        System.out.println("Number HashSet: " + nHash);
        sHash.clear();
        nHash.clear();
        System.out.println("String HashSet after clearing : " + sHash);
        System.out.println("Number HashSet after clearing : " + nHash);


    }
}
