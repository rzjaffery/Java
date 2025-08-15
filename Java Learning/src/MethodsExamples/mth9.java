package MethodsExamples;

public class mth9 {
    public static void printChar(char char1,char char2,int n){
        for (int i = 1; char1 <= char2; i++,char1++) {
            System.out.print(char1 + " ");
            if (i % n == 0)
                System.out.println();
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
//        9. Print Characters Between Two Characters

        printChar('(','z',20);
    }
}
