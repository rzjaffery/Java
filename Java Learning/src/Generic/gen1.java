package Generic;


public class gen1 {

    public static void main(String[] args) {
        container<String> str = new container<>();
        str.setItem("Rayyan");
        System.out.println(str.getItem());
        container<Integer> intt = new container<>();
        intt.setItem(235);
        System.out.println(intt.getItem());
        container<Double> dou = new container<>();
        dou.setItem(22.568);
        System.out.println(dou.getItem());
        printer<Integer> pr1 = new printer<>();
        pr1.print(234);
        printer<String> pr2 = new printer<>();
        pr2.print("how are you");
        printer<Double> pr3 = new printer<>();
        pr3.print(5526518.21962269);
    }
}

