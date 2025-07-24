import javax.swing.*;
import java.awt.*;

public class factorialCalculator {
    public static int facCalculator (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * facCalculator (n - 1);
    }

    public static int facCal (JTextField n) {
        try {
            int num = Integer.parseInt (n.getText ());
            if (num < 0) {
                JOptionPane.showMessageDialog (null, "Please enter a non-negative number.");
                return 0;
            }
            return facCalculator (num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Enter a valid number.");
            return 0;
        }

    }

    public static void main () {

        JFrame facFrame = new JFrame ("Factorial Calculator");
        facFrame.setSize (500, 500);
        facFrame.setLayout (null);


        JTextField num1 = new JTextField ();
        num1.setBounds (150, 50, 100, 40);


        JLabel resultLabel = new JLabel ("Factorial: ");
        resultLabel.setBounds (150, 250, 200, 30);

        JButton fac = new JButton ("Factorial");
        fac.setBounds (150, 150, 200, 40);
        fac.addActionListener (e -> {
                    int result = facCal (num1);
                    resultLabel.setText ("Factorial: " + result);
                }

        );


        facFrame.add (num1);
        facFrame.add (fac);
        facFrame.add (resultLabel);
        facFrame.setVisible (true);
        facFrame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);


//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a Number : ");
//        int a = scan.nextInt();
//        System.out.println("Factorial: " + (long)facCalculator(a));
    }
}
