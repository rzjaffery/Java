package ArithematicOperations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class mainArithmatic {

    public static double addition (JTextField x, JTextField y) {
        try {
            double a = Double.parseDouble (x.getText ());
            double b = Double.parseDouble (y.getText ());
            return a + b;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Enter valid numbers!");
            return 0;
        }

    }

    public static double subtraction (JTextField x, JTextField y) {
        try {
            double a = Double.parseDouble (x.getText ());
            double b = Double.parseDouble (y.getText ());
            return a - b;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Enter valid numbers!");
            return 0;
        }

    }

    public static double multiplication (JTextField x, JTextField y) {
        try {
            double a = Double.parseDouble (x.getText ());
            double b = Double.parseDouble (y.getText ());
            return a * b;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Enter valid numbers!");
            return 0;
        }

    }

    public static double division (JTextField x, JTextField y) {
        try {
            double a = Double.parseDouble (x.getText ());
            double b = Double.parseDouble (y.getText ());
            if (b == 0) {
                JOptionPane.showMessageDialog (null, "Cannot divide by zero.");
                return 0;
            }
            return a / b;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Enter valid numbers!");
            return 0;
        }

    }

    public static double modulus (JTextField x, JTextField y) {
        try {
            double a = Double.parseDouble (x.getText ());
            double b = Double.parseDouble (y.getText ());
            return a % b;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Enter valid numbers!");
            return 0;
        }

    }

    public static void main () {

        Scanner scan = new Scanner (System.in);

        JFrame arithFrame = new JFrame ("Arithmetic Operations");
        arithFrame.setSize (500, 500);
        arithFrame.setLayout (null);  // Using absolute positioning

        JTextField num1 = new JTextField ();
        num1.setBounds (150, 50, 100, 40);

        JTextField num2 = new JTextField ();
        num2.setBounds (150, 100, 100, 40);

        JLabel resultLabel = new JLabel ("Result: ");
        resultLabel.setBounds (150, 400, 200, 30);

        // Create buttons with unique positions
        JButton add = new JButton ("Addition");
        add.setBounds (150, 150, 200, 40);
        add.addActionListener (e -> {
                    double result = addition (num1, num2);
                    resultLabel.setText ("Result: " + result);
                }

        );

        JButton sub = new JButton ("Subtraction");
        sub.setBounds (150, 200, 200, 40);
        sub.addActionListener (e -> {
                    double result = subtraction (num1, num2);
                    resultLabel.setText ("Result: " + result);
                }

        );

        JButton mul = new JButton ("Multiplication");
        mul.setBounds (150, 250, 200, 40);
        mul.addActionListener (e -> {
                    double result = multiplication (num1, num2);
                    resultLabel.setText ("Result: " + result);
                }
        );

        JButton div = new JButton ("Division");
        div.setBounds (150, 300, 200, 40);
        div.addActionListener (e -> {
                    double result = division (num1, num2);
                    resultLabel.setText ("Result: " + result);
                }
        );

        JButton mod = new JButton ("Modulus");
        mod.setBounds (150, 350, 200, 40);
        mod.addActionListener (e -> {
                    double result = modulus (num1, num2);
                    resultLabel.setText ("Result: " + result);
                }
        );



        arithFrame.add (num1);
        arithFrame.add (num2);
        arithFrame.add (resultLabel);
        arithFrame.add (add);
        arithFrame.add (sub);
        arithFrame.add (mul);
        arithFrame.add (div);
        arithFrame.add (mod);
        arithFrame.setVisible (true);


//        System.out.println("Select to perform these actions");
//        System.out.println("1) Addition");
//        System.out.println("2) Subtraction");
//        System.out.println("3) Multiplication");
//        System.out.println("4) Division");
//        System.out.println("5) Modulus");
//        System.out.println("6) Square Root");
//
//        System.out.print("Select :");
//        int option = scan.nextInt();
//        double a = 0;
//        double b = 0;
//
//        switch (option) {
//            case 1:
//                System.out.println("Addition Selected: ");
//                System.out.print("Enter 2 numbers: ");
//                a = scan.nextDouble();
//                b = scan.nextDouble();
//                System.out.println(a + " + " + b + " = " + (int)addition(a, b));
//                break;
//            case 2:
//                System.out.println("Subtraction Selected: ");
//                System.out.print("Enter 2 numbers: ");
//                a = scan.nextDouble();
//                b = scan.nextDouble();
//                System.out.println(a + " - " + b + " = " + (int)subtraction(a, b));
//                break;
//            case 3:
//                System.out.println("Multiplication Selected: ");
//                System.out.print("Enter 2 numbers: ");
//                a = scan.nextDouble();
//                b = scan.nextDouble();
//                System.out.println(a + " * " + b + " = " + (int)multiplication(a, b));
//                break;
//            case 4:
//                System.out.println("Division Selected: ");
//                System.out.print("Enter 2 numbers: ");
//                a = scan.nextDouble();
//                b = scan.nextDouble();
//                System.out.println(a + " / " + b + " = " + (int)division(a, b));
//                break;
//            case 5:
//                System.out.println("Modulus Selected: ");
//                System.out.print("Enter 2 numbers: ");
//                a = scan.nextDouble();
//                b = scan.nextDouble();
//                System.out.println(a + " % " + b + " = " + (int)modulus(a, b));
//                break;
//            case 6:
//                System.out.println("Square Root Method Selected: ");
//                System.out.print("Enter a number: ");
//                a = scan.nextDouble();
//                System.out.println("Square Root of " + a + " is " + (int)Math.sqrt(a));
//                break;
//        }


//    public static double addition(double x, double y) {
//        return x + y;
//    }
//
//    public static double subtraction(double x, double y) {
//        return x - y;
//    }
//
//    public static double multiplication(double x, double y) {
//        return x * y;
//    }
//
//    public static double division(double x, double y) {
//        if (y <= 0) {
//            return 0;
//        }
//        return x / y;
//    }
//
//    public static double modulus(double x, double y) {
//        return x % y;
//    }

    }
}
