package MethodsExamples;

import java.util.Scanner;

public class mth18 {
    //    18. Check Consecutive Integers
    public static boolean consecutiveNumber(int x, int y, int z) {
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        int middle = x + y + z - max - min;
        return (max - middle == 1) && (middle - min == 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 3 consecutive number ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (consecutiveNumber(a, b, c))
            System.out.print("Numbers are consecutive ");
        else
            System.out.print("They are not consecutive ");
    }
}
