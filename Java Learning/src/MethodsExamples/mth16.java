package MethodsExamples;

public class mth16 {
    //    16. Find Twin Primes Less Than 100
    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2))
                System.out.printf("(%d , %d) \n", i, i + 2);
        }
    }
}
