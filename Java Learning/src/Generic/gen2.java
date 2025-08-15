package Generic;

public class gen2 {

    public static <T> boolean compareArr(T [] a1, T [] a2){
        if (a1.length != a2.length)
            return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer [] arr1 = {1,2,3,4,5};
        Integer [] arr2 = {1,2,3,5};
        Integer [] arr3 = {1,2,3,4,5};
        String [] str1 = {"Rayyan" , "Zafar"};
        String [] str2 = {"Ali" , "Zafar"};
        String [] str3 = {"Ali" , "Zafar"};

        printer <Boolean> p1 = new printer<>();

        p1.print(compareArr(arr1,arr2));
        p1.print(compareArr(arr1,arr3));
        p1.print(compareArr(arr2,arr3));
        p1.print(compareArr(str1,str2));
        p1.print(compareArr(str1,str3));
        p1.print(compareArr(str2,str3));
    }
}
