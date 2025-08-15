package Array;

public class array3 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 78, 89, 65, 32, 14, 47, 58, 25, 20, 30, 26, 36, 9, 5};

        double avg = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Length: " + arr.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
