package Array;

import java.util.Scanner;

public class array4 {
    public static boolean findnum(int[] arr, int spnum){
        for (int i = 0; i < arr.length; i++) {
            if(spnum == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 89, 65, 32, 14, 47, 58, 25, 20, 30, 26, 36, 9, 5};

        int spnum=0;
        boolean find;
        Scanner scanner = new Scanner(System.in);


        spnum = scanner.nextInt();
        find = findnum(arr,spnum);
        System.out.println("Found: "+find );


    }
}
