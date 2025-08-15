package Generic;

import java.util.ArrayList;
import java.util.List;

public class gen5 {
    public static <T> List <T> mergeList(List <T> list1, List<T> list2){
        List<T> mergeL = new ArrayList<>();

        int maxLen = Math.max( list1.size(),list2.size());

        for (int i = 0; i < maxLen; i++) {
            if (i < list1.size()){
                mergeL.add(list1.get(i));
            }
            if (i <list2.size()){
                mergeL.add(list2.get(i));
            }
        }
        return mergeL;
    }

    public static void main(String[] args) {
        List <Integer> n1 = List.of(2,5,8,9,4,10);
        List <Integer> n2 = List.of(2,5,5,4,7,1,0);
        System.out.println("Number Lists:");
        System.out.println("N1: "+ n1);
        System.out.println("N2: "+ n2);
        System.out.println("Merge List: "+mergeList(n1,n2));

        List <String> s1 = List.of("Gym","Strong","hello","from","girl","boy");
        List <String> s2 = List.of("bold","italic","underline");
        System.out.println("String Lists:");
        System.out.println("S1: "+ s1);
        System.out.println("S2: "+ s2);
        System.out.println("Merge List: "+mergeList(s1,s2));


    }
}
