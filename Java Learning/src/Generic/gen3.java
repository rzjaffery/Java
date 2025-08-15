package Generic;

import java.util.List;

public class gen3 {

    public static <T extends Number> void sum(List <T> num){
        double evenSum = 0;
        double oddSum = 0;

        for (T number : num){
            if (number.doubleValue()%2==0){
                evenSum += number.doubleValue();
            }
            else {
                oddSum += number.doubleValue();
            }
        }

        System.out.println("Original list: "+num);
        System.out.println("Even Sum: "+evenSum);
        System.out.println("Odd Sum: "+oddSum);
    }

    public static void main(String[] args) {
        List <Integer> l1 = List.of(1,2,3,4,5,6,7,8,9);
        List <Double> d1 = List.of(2.0,5.0,2.0,2.95,3.33,7.65,8.41,1.0);

        sum(l1);
        sum(d1);
    }
}
