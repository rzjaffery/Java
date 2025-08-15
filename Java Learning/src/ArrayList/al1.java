package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class al1 {
    public static void main(String[] args) {

//        Adding in the list

        List<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);

        List<String> str1 = new ArrayList<String>();
        str1.add("Hello");
        str1.add("Bello");
        str1.add("Jello");
        str1.add("Tello");
        str1.add("Mello");

        System.out.println(num1);
        System.out.println(str1);

//        Iterative Printing
        System.out.println("Iterative printing");

        for (Integer n : num1) {
            System.out.println(n);

        }

//        Adding in certain positions

        num1.addFirst(0);
        str1.add(5, "Zello");

        System.out.println(num1);
        System.out.println(str1);

//        Retrieving an element

        int n = num1.get(4);
        String s = str1.get(2);

        System.out.println(n);
        System.out.println(s);

//        update array element

        num1.set(1, 11);
        str1.set(4, "Mylello");

        System.out.println(num1);
        System.out.println(str1);

//        remove third element

        num1.remove(3);
        str1.remove(3);

        System.out.println(num1);
        System.out.println(str1);
//        Search Element in the list

        if (num1.contains(4))
            System.out.println("Numbers have 4");
        else
            System.out.println("Numbers does not have 4");

//        Sort Array list

        System.out.println("Before sorting");
        System.out.println(num1);
        System.out.println(str1);
        Collections.sort(num1);
        Collections.sort(str1);

        System.out.println("After sorting");
        System.out.println(num1);
        System.out.println(str1);

//        shuffle array list
        System.out.println("Before shuffling");
        System.out.println(num1);
        System.out.println(str1);
        Collections.shuffle(num1);
        Collections.shuffle(str1);

        System.out.println("After shuffling");
        System.out.println(num1);
        System.out.println(str1);

//        printing array list using for loop

        for (int i : num1){
            System.out.println(i);
        }
        for (String i : str1){
            System.out.println(i);
        }
    }
}
