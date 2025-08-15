import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        process(size );
    }
    public static void process(int size) {
        // TODO -- add your code here
        int w=2*size;

        System.out.print("+");
        for (int i = 0; i < w; i++) System.out.print("-");
        System.out.println("+");

        for (int i = 0; i < size-1; i++) {

            System.out.print("|");

            for (int j = 0; j < size - 1 - i; j++) System.out.print(" ");
            System.out.print("/");

            for (int j = 0; j < 2*i; j++)  System.out.print(i%2==0 ? "=":"-");
            System.out.print("\\");

            for (int j = 0; j < size-1-i; j++) System.out.print(" ");
            System.out.println("|");
        }
        if (size %2 == 0){
        System.out.print("|"+"<");
        for (int i = 0; i < w-2; i++) System.out.print("-");
        System.out.println(">"+"|");
        }
        else {
            System.out.print("|"+"<");
            for (int i = 0; i < w-2; i++) System.out.print('=');
            System.out.println(">"+"|");
        }

        for (int i = size - 2; i >= 0; i--) {
            System.out.print("|");

            for (int j = 0; j < size - 1 - i; j++) System.out.print(" ");
            System.out.print("\\");

            for (int j = 0; j < 2 * i; j++) System.out.print(i % 2 == 0 ? "=" : "-");
            System.out.print("/");

            for (int j = 0; j < size - 1 - i; j++) System.out.print(" ");
            System.out.println("|");
        }
        System.out.print("+");
        for (int i = 0; i < w; i++) System.out.print("-");
        System.out.println("+");

    }
}