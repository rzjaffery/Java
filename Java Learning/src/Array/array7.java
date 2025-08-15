package Array;

import java.util.Scanner;

public class array7 {
    public static void matAdd(int [][] mat1, int [][] mat2, int m, int n){
        int [][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Sum Matrix ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void matMul(int [][] mat1, int [][] mat2, int m, int n){
        int [][] mul = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                mul[i][j] = mat1[i][j] * mat2[j][i];
            }
        }
        System.out.println("Sum Matrix ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int a,b;

        Scanner scan = new Scanner(System.in);

        System.out.print("a: ");
        a = scan.nextInt();
        System.out.print("b: ");
        b = scan.nextInt();

        int [][] m1 = new int[a][b];
        int [][] m2 = new int[a][b];

        System.out.println("Enter the number for Matrix 1");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the number for Matrix 2");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m2[i][j] = scan.nextInt();
            }
        }

        matAdd(m1,m2,a,b);

        System.out.print("Multiplied Matrix");
        matMul(m1,m2,a,b);




    }
}

