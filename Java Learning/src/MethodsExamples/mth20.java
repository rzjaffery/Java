package MethodsExamples;

import java.util.Scanner;

public class mth20 {
//    20. Extract First Digit of Integer

    public static int test(int n){
        int fact_num = 10;
        while(n / fact_num != 0){
            fact_num *= 10;
        }
        return Math.abs(n / (fact_num/10));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("First digit : "+test(num));
    }
}
