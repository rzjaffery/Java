package Array;

public class array2 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 78, 89, 65, 32, 14, 47, 58, 25, 20, 30, 26, 36, 9, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
