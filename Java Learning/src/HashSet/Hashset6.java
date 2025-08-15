package HashSet;

import java.util.HashSet;

public class Hashset6 {
    public static void main(String[] args) {

        HashSet<String> sHash = new HashSet<String>();
        HashSet<Integer> nHash = new HashSet<Integer>();

        HashSet<String> stHash = new HashSet<String>();
        HashSet<Integer> nmHash = new HashSet<Integer>();

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

        stHash.add("Rayyan");
        stHash.add("Rayyan");
        stHash.add("Ahmed");
        stHash.add("Sana");
        stHash.add("Ali");

        nmHash.add(5);
        nmHash.add(10);
        nmHash.add(15);
        nmHash.add(10);
        nmHash.add(25);

        System.out.println("String HashSet: " + sHash);
        System.out.println("Number HashSet: " + nHash);
        System.out.println("String2 HashSet: " + stHash);
        System.out.println("Number2 HashSet: " + nmHash);

//        Write a Java program to compare two hash set.

        System.out.println("String 2 contains the content of String 1");
        for (String i : sHash){
            System.out.println(stHash.contains(i) ? "Yes" : "No");
        }

        System.out.println("Number 2 contains the content of Number 1");
        for (Integer i : nHash){
            System.out.println(nmHash.contains(i) ? "Yes" : "No");
        }

//        Write a Java program to compare two sets and retain elements that are the same.


        sHash.retainAll(stHash);
        nHash.retainAll(nmHash);

        System.out.println("String HashSet has common content from String 1: " + sHash);
        System.out.println("Number HashSet have content from number 1: " + nHash);



    }
}
