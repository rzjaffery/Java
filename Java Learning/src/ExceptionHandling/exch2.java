package ExceptionHandling;

public class exch2 {
    public static void main(String[] args) {
        int n1 = 20;
        evenNum(n1);
        int n2 = 3;
        evenNum(n2);
    }

    public static void evenNum(int number){
        try {
            checkEven(number);
            System.out.println(number + " is even ");
        }
        catch (ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void checkEven(int number){
        if (number % 2 != 0) {
            throw new ArithmeticException(number + " is odd");
        }
    }
}
