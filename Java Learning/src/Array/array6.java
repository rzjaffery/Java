package Array;

public class array6 {
    public static void dupInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i!=j)){
                    System.out.println("Duplicate Element: "+ arr[j]);
                }
            }
        }
    }

    public static void dupString(String[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i].equals(arr[j])) && (i!=j)){
                    System.out.println("Duplicate Element: "+ arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 89, 65,32, 32, 14, 47, 58, 25, 20, 30, 26, 36, 9, 5};
        String[] str = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};


        dupInt(arr);
        dupString(str);
    }
}
