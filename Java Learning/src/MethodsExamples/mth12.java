package MethodsExamples;

import java.util.Scanner;

public class mth12 {

//    12. Display n-by-n Matrix
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();
        int [][] arr;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print((int) (Math.random() * 2)+ " ");
            }
            System.out.println();
        }
    }
}
