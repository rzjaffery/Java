package MethodsExamples;

import java.util.Scanner;

public class mth8 {

    public static double futureInvestment(double inv, double rate,int yr){
        return inv * Math.pow(1 + rate, yr * 12);
    }
    public static void main(String[] args) {
//        8. Compute Future Investment Value

        Scanner scn = new Scanner(System.in);

        double investment = scn.nextDouble();
        float rate = scn.nextFloat();
        int year = scn.nextInt();
        rate*=0.01;

        System.out.println("Year        Future Value");
        for (int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) {
                formatter = 18;
            }
            System.out.printf(i + "%"+formatter+".2f\n", futureInvestment(investment,rate/12,i));
        }
    }
}
