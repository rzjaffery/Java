package HashSet;

import java.util.HashSet;

public class Hashset4 {
    public static void main(String[] args) {

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


//        Write a Java program to clone a hash set to another hash set.

        HashSet<String> stringClone = new HashSet<String>();
        HashSet<Integer> numberClone = new HashSet<Integer>();

        System.out.println("Cloning the String and Number HashSet");
        stringClone = (HashSet) sHash.clone();
        numberClone = (HashSet) nHash.clone();

        System.out.println("After Cloning String and Number Hashset");
        System.out.println("String HashSet: " + stringClone);
        System.out.println("Number HashSet: " + numberClone);




    }
}
