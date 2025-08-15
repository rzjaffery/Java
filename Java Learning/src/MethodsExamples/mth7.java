package MethodsExamples;

public class mth7 {
    public static int getPentagonNumber(int i){
        return (i*(3*i-1))/2;
    }
    public static void main(String[] args) {
//        7. Display First 50 Pentagonal Numbers

        int count = 0;
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%6d",getPentagonNumber(i));
            if (i % 10==0){
                System.out.println();
            }
                count++;
        }

    }
}
