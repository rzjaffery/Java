package Array;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int [] arr = {12,45,78,89,65,32,14,47,58,25,20,30,26,36,9,5};

        System.out.println("Array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array sorted: " + Arrays.toString(arr));
    }
}
