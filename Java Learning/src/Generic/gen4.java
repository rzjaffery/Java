package Generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class gen4 {

    public static <T> List<T> reverse(List<T> originalList) {
        List<T> revList = new ArrayList<>();

        for (int i = originalList.size()-1; i >= 0; i--) {
            revList.add(originalList.get(i));
        }
        return revList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> colors = List.of("Red", "Green", "Orange");

        List<Integer> reversednumbers = reverse(numbers);
        System.out.println("Original List: " + numbers);
        System.out.println("Reversed List: " + reversednumbers);

        List<String> reversedstring = reverse(colors);
        System.out.println("Original List: " + colors);
        System.out.println("Reversed List: " + reversedstring);

    }

}
