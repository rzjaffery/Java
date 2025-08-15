package TreeSet;

import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {

        TreeSet<Integer> num1 = new TreeSet<>();


        num1.add(20);
        num1.add(10);
        num1.add(50);
        num1.add(40);
        num1.add(80);
        num1.add(55);
        num1.add(84);
        num1.add(36);
        num1.add(75);
        num1.add(90);
        num1.add(28);
        num1.add(17);
        num1.add(44);
        num1.add(40);
        num1.add(81);

        System.out.println("Number Tree Set " + num1);
        System.out.println("Number Tree Set Size " + num1.size());
//        Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("Number Tree Set greater than 55 " + num1.ceiling(55));
        System.out.println("Number Tree Set greater than 12 " + num1.ceiling(12));

//        Write a Java program to get the element in a tree set less than or equal to the given element.
        System.out.println("Number Tree Set lesser than 69 " + num1.floor(69));
        System.out.println("Number Tree Set lesser than 22 " + num1.floor(22));

//        Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
        System.out.println("Number Tree Set element higher than 17 " + num1.higher(17));

//        Write a Java program to get an element in a tree set that has a lower value than the given element.
        System.out.println("Number Tree Set element lower than 88 " + num1.lower(88));

//        Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("Removes the first(lowest) element: " + num1.pollFirst());
        System.out.println("Number Tree Set after removal " + num1);

//        Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("Removes the Last(Highest) element: " + num1.pollLast());
        System.out.println("Number Tree Set after removal " + num1);

    }
}
