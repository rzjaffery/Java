package String;

import java.util.Calendar;
import java.util.Date;

public class string2 {
    public static void main(String[] args) {
        String str1 = " This is exercise 1 ";
        String str2 = " This is Exercise 1 ";

//        int compare = str1.compareToIgnoreCase(str2);
//        System.out.println(compare);
        boolean equal = str1.equalsIgnoreCase(str2);
        Calendar c = Calendar.getInstance();

        System.out.println("Concatenated String : " + str1.concat(str2));
        System.out.println("Equal String : " + equal);
        System.out.println("Current Date and Time : ");
        System.out.format("%tB %te,%tY%n",c,c,c);
        System.out.format("%tl %tm,%tp%n",c,c,c);

    }
}
