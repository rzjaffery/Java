package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class al2 {

    public static <T> List<T> enterList(Function<String, T> convertor, String msg) {
        Scanner scanner = new Scanner(System.in);
        List<T> arrlist = new ArrayList<>();
        System.out.println(msg);
        System.out.println("Enter values (type 'end' to stop):");

        while (true) {
            String input = scanner.nextLine().trim();
            if(input.equalsIgnoreCase("end"))
                break;

            try {
                T value = convertor.apply(input);
                arrlist.add(value);
            }
            catch (Exception e){
                System.out.println("Invalid Input ");
            }
        }
        return arrlist;
    }

    public static void main(String[] args) {

        List<Integer> intList = enterList(Integer::parseInt,"Enter Integer Number");
        List<String> strList = enterList(s -> s,"Enter String Character");
        List<Double> douList = enterList(Double::parseDouble,"Enter String Character");


        System.out.println("Integer List: "+intList);
        System.out.println("String List: "+strList);
        System.out.println("Double List: "+douList);




    }
}
