package ExceptionHandling;

public class exch1 {

    public static int divider(int dividend, int divisor) {
        if (divisor == 0){
            throw new ArithmeticException("Infinity");
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divider(10, 0);
            System.out.println("Result " + result);
        }
        catch (ArithmeticException e){
System.out.println("Cannot solve " + e.getMessage());
        }
    }
}
