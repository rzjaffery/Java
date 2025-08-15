package String;

public class string1 {

    public static void charAt(){
        String str = "Rayyan Zafar";

        System.out.println(str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("Character at 0 " + (char)index1);
        System.out.println("Character at 10 " + (char)index2);
    }
    public static void uniCodeAt(){
        String str = "www.google.com";

        System.out.println(str);

        int index1 = str.codePointAt(0);
        int index2 = str.codePointAt(10);
        int count = str.codePointCount(0,10);

        System.out.println("Character at 0 " + index1);
        System.out.println("Character at 10 " + index2);
        System.out.println("Code Point Count from 0 to 10 " + count);
    }

    public static void main(String[] args) {
        charAt();
        uniCodeAt();
    }
}
