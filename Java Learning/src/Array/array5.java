package Array;

import java.util.Arrays;

public class array5 {

    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 89, 65, 32, 14, 47, 58, 25, 20, 30, 26, 36, 9, 5};

        int len = arr.length;

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i -1];
            arr[len-i-1] = temp;
        }


        System.out.println("Array reverse: " + Arrays.toString(arr));
    }
}
