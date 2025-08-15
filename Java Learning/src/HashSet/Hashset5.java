package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset5 {
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

//        Write a Java program to convert a hash set to an array.
        String [] newS = new String[sHash.size()];
        Integer [] newN = new Integer[nHash.size()];

        sHash.toArray(newS);
        nHash.toArray(newN);

        System.out.println("String HashSet into Array");
        for (int i = 0; i < sHash.size(); i++) {
            System.out.println(newS[i]);
        }

        System.out.println("Number HashSet into Array");
        for (int i = 0; i < nHash.size(); i++) {
            System.out.println(newN[i]);
        }

//        Write a Java program to convert a hash set to a tree set.

        Set<String> treeString = new TreeSet<String>(sHash);
        Set<Integer> treeNumber = new TreeSet<Integer>(nHash);


        System.out.println("String HashSet into TreeSet");
        for (String i : treeString){
            System.out.println(i);
        }

        System.out.println("Number HashSet into TreeSet");
        for (int i : treeNumber){
            System.out.println(i);
        }



    }
}
