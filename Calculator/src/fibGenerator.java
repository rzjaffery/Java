import javax.swing.*;

public class fibGenerator {

//    public static int fibGen(int num){
//        if (num ==0){
//            return num;
//        } else if (num ==1) {
//            return num ;
//        }
//        return fibGen(num - 1)+fibGen(num-2);
//    }

    public static String fibGen(int n){
        if (n<=0) return "Invalid Input";

        StringBuilder sequence = new StringBuilder ();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            sequence.append(a).append(i < n - 1 ? ", " : "");
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sequence.toString ();
    }


    public static void main() {

        JFrame fibFrame = new JFrame ("Fibonacci Sequence Generator");
        fibFrame.setSize (500, 500);
        fibFrame.setLayout (null);


        JTextField num1 = new JTextField ();
        num1.setBounds (150, 50, 100, 40);


        JLabel resultLabel = new JLabel ("Fibonacci Sequence: ");
        resultLabel.setBounds (150, 250, 200, 30);

        JButton fibg = new JButton ("Generate");
        fibg.setBounds (150, 150, 200, 40);
        fibg.addActionListener (e -> {
                   try{
                       int count = Integer.parseInt (num1.getText ());
                       if (count <= 0) {
                           JOptionPane.showMessageDialog(fibFrame, "Enter a positive number.");
                           return;
                       }
                       String result = fibGen (count);
                       resultLabel.setText("<html>Fibonacci Sequence: <br/>" + result + "</html>");
                   } catch (NumberFormatException ex) {
                       JOptionPane.showMessageDialog(fibFrame, "Please enter a valid number.");
                   }
                }

        );


        fibFrame.add (num1);
        fibFrame.add (fibg);
        fibFrame.add (resultLabel);
        fibFrame.setVisible (true);
        fibFrame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter the range till you want the fibonacci sequence ");
//        int n = scan.nextInt();
//        System.out.println("Fibonacci Sequence is ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibGen(i));
//            if (i < n-1){
//                System.out.print(", ");
//            }
//        }
    }
}
