import ArithematicOperations.mainArithmatic;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 500);
        frame.setLayout(null);  // Using absolute positioning

        // Create buttons with unique positions
        JButton arithmetic = new JButton("Arithmetic Operations");
        arithmetic.setBounds(150, 50, 200, 40);
        arithmetic.addActionListener (
                e -> mainArithmatic.main ()
        );

        JButton fact = new JButton("Factorial Operations");
        fact.setBounds(150, 100, 200, 40);
        fact.addActionListener (
                e -> factorialCalculator.main ()
        );

        JButton fib = new JButton("Fibonacci Operations");
        fib.setBounds(150, 150, 200, 40);
        fib.addActionListener (
                e -> fibGenerator.main ()
        );

        JButton volArea = new JButton("Volume/SurfaceArea Operations");
        volArea.setBounds(150, 200, 200, 40);
        volArea.addActionListener (
                e -> shape2d.main ()
        );

        JButton periArea = new JButton("Area/Perimeter Operations");
        periArea.setBounds(150, 250, 200, 40);
        periArea.addActionListener (
                e -> shape3d.main ()
        );

        // Add buttons to frame
        frame.add(arithmetic);
        frame.add(fact);
        frame.add(fib);
        frame.add(volArea);
        frame.add(periArea);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Console-based menu logic
//        int option;
//        do {
//            System.out.println("\nCalculator ");
//            System.out.println("Select Option to perform operation ");
//            System.out.println("0) To exit program ");
//            System.out.println("1) Arithmetic Operations ");
//            System.out.println("2) Factorial Calculation ");
//            System.out.println("3) Fibonacci Generator ");
//            System.out.println("4) Volume/Surface Area Calculator ");
//            System.out.println("5) Area/Perimeter Calculator ");
//
//            while (!scan.hasNextInt()) {
//                System.out.println("Invalid input. Please enter a number.");
//                scan.next();
//                System.out.print("Enter your choice: ");
//            }
//
//            option = scan.nextInt();
//
//            switch (option) {
//                case 0:
//                    System.out.println("Exiting program...");
//                    break;
//                case 1:
//                    System.out.println("Arithmetic Operation Calculator selected");
//                    // mainArithmetic.main(); // Uncomment if exists
//                    break;
//                case 2:
//                    System.out.println("Factorial Calculator selected");
//                    // factorialCalculator.main(); // Uncomment if exists
//                    break;
//                case 3:
//                    System.out.println("Fibonacci Generator selected");
//                    // fibGenerator.main(); // Uncomment if exists
//                    break;
//                case 4:
//                    System.out.println("Volume/Surface Area Calculator selected");
//                    // shape3d.main(); // Uncomment if exists
//                    break;
//                case 5:
//                    System.out.println("Area/Perimeter Calculator selected");
//                    // shape2d.main(); // Uncomment if exists
//                    break;
//                default:
//                    System.out.println("Invalid Option ");
//            }
//        } while (option != 0);
    }
}
