import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scn = new Scanner (System.in);
    public static HashMap<String, Double> rates = new HashMap<> ();

    public static void main(String[] args) {


        while (true) {

            System.out.println ("\n" +
                    "Currency Converter\n" +
                    "1) Convert Currency\n" +
                    "2) See the Rates\n" +
                    "3) Exit\n");
            System.out.print ("Enter the choice: ");
            int choice = scn.nextInt ();

            switch (choice) {
                case 1 -> conversion ();
                case 2 -> showRates ();
                case 3 -> {
                    System.out.println ("Exiting program. Goodbye!");
                    return;
                }
                default -> System.out.println ("Invalid choice. Please enter 1–3.");
            }
        }


    }

    private static void showRates() {
        System.out.println ("Rates are: ");
        for (String currency : rates.keySet ()) {
            System.out.println (currency + ": " + rates.get (currency));
        }
    }


    static void intializeRates() {
        rates.put ("USD", 1.0);
        rates.put ("PKR", 278.5);
        rates.put ("EUR", 0.92);
        rates.put ("GBP", 0.79);
        rates.put ("INR", 83.2);
        rates.put ("SAR", 3.75);
    }

    static void conversion() {
        intializeRates ();
        System.out.print ("From: ");
        String fromCurrency = scn.next ().toUpperCase ();
        System.out.print ("To: ");
        String toCurrency = scn.next ().toUpperCase ();
        System.out.print ("Amount: ");
        double amount = scn.nextDouble ();
        if (!rates.containsKey (fromCurrency) || !rates.containsKey (toCurrency)) {
            System.out.println ("Invalid currency code. Try again.");
            return;
        }

        double usdAmount = amount / rates.get (fromCurrency);
        double result = usdAmount * rates.get (toCurrency);

        System.out.printf ("Converted Amount: %.2f %s = %.2f %s\n", amount, fromCurrency, result, toCurrency);
    }
}