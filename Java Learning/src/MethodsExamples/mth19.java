package MethodsExamples;

import java.util.Scanner;

public class mth19 {
//    19. Check If One Integer is Midpoint of Others

    public static boolean midpoint(int x, int y, int z) {
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        int mid1 = (max + min) / 2;
        int mid2 = x + y + z - max - min;
        return (mid1 == mid2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter 3 number which can have a middle number");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.print("these numbers have a middlepoint " + midpoint(a, b, c));
    }
}
