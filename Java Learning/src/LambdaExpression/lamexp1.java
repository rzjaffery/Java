package LambdaExpression;

import java.util.Scanner;

public class lamexp1 {
    public static void main(String[] args) {
//        1. Sum two integers using lambda expression
        Scanner scanner = new Scanner(System.in);
        sumCalculator calculator = (a, b) -> a + b;
        int x, y;
        System.out.print("enter 2 numbers to add ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        int result = calculator.sum(x, y);
        System.out.print("sum = " + result);

    }

    interface sumCalculator {
        int sum(int a, int b);
    }
}
