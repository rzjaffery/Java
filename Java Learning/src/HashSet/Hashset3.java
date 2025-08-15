package HashSet;

import java.util.HashSet;

public class Hashset3 {
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


//        Write a Java program to test if a hash set is empty or not.


        System.out.println("Is String Hash Empty : " + sHash.isEmpty());
        System.out.println("Is Number Hash Empty : " + nHash.isEmpty());
        sHash.clear();
        nHash.clear();
        System.out.println("Is String Hash Empty : " + sHash.isEmpty());
        System.out.println("Is Number Hash Empty : " + nHash.isEmpty());

//        Write a Java program to remove all elements from a hash set.

        System.out.println("String HashSet " + sHash);
        System.out.println("Number HashSet " + nHash);
    }
}
