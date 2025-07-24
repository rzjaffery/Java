import javax.swing.*;
import java.awt.event.*;

abstract class shape2 {
    abstract double area();
    abstract double perimeter();
}

// Shape Classes
class square extends shape2 {
    private double l;
    public square(double len) { l = len; }
    double area() { return Math.pow(l, 2); }
    double perimeter() { return 4 * l; }
}

class rectangle extends shape2 {
    private double l, b;
    public rectangle(double len, double bre) { l = len; b = bre; }
    double area() { return l * b; }
    double perimeter() { return 2 * (l + b); }
}

class triangle extends shape2 {
    private double l1, l2, l3;
    public triangle(double len1, double len2, double len3) {
        l1 = len1; l2 = len2; l3 = len3;
    }
    double area() {
        double s = (l1 + l2 + l3) / 2;
        return Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }
    double perimeter() { return l1 + l2 + l3; }
}

class trapezium extends shape2 {
    private double base, height;
    public trapezium(double b, double h) { base = b; height = h; }
    double area() { return 0.5 * base * height; }
    double perimeter() { return 0; } // Not enough data for full perimeter
}

class circle extends shape2 {
    private double r;
    public circle(double radius) { r = radius; }
    double area() { return Math.PI * r * r; }
    double perimeter() { return 2 * Math.PI * r; }
}

public class shape2d {

    public static void main() {
        JFrame frame = new JFrame("2D Shape Calculator");
        frame.setSize(500, 500);
        frame.setLayout(null);

        String[] shapes = {"Select Shape", "Square", "Rectangle", "Circle", "Triangle", "Trapezium"};
        JComboBox<String> shapeList = new JComboBox<>(shapes);
        shapeList.setBounds(150, 30, 200, 30);

        // Input fields
        JTextField input1 = new JTextField();
        input1.setBounds(150, 80, 150, 30);
        JTextField input2 = new JTextField();
        input2.setBounds(150, 120, 150, 30);
        JTextField input3 = new JTextField();
        input3.setBounds(150, 160, 150, 30);

        // Labels
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(150, 300, 300, 30);

        // Calculate button
        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(150, 220, 150, 40);

        // Add all to frame
        frame.add(shapeList);
        frame.add(input1);
        frame.add(input2);
        frame.add(input3);
        frame.add(calcButton);
        frame.add(resultLabel);

        // Hide unused inputs initially
        input1.setVisible(false);
        input2.setVisible(false);
        input3.setVisible(false);

        // Shape selection listener
        shapeList.addActionListener(e -> {
            String selected = (String) shapeList.getSelectedItem();
            input1.setText(""); input2.setText(""); input3.setText("");

            switch (selected) {
                case "Square":
                    input1.setVisible(true); input1.setToolTipText("Side length");
                    input2.setVisible(false); input3.setVisible(false);
                    break;
                case "Rectangle":
                    input1.setVisible(true); input1.setToolTipText("Length");
                    input2.setVisible(true); input2.setToolTipText("Breadth");
                    input3.setVisible(false);
                    break;
                case "Circle":
                    input1.setVisible(true); input1.setToolTipText("Radius");
                    input2.setVisible(false); input3.setVisible(false);
                    break;
                case "Triangle":
                    input1.setVisible(true); input1.setToolTipText("Side 1");
                    input2.setVisible(true); input2.setToolTipText("Side 2");
                    input3.setVisible(true); input3.setToolTipText("Side 3");
                    break;
                case "Trapezium":
                    input1.setVisible(true); input1.setToolTipText("Base");
                    input2.setVisible(true); input2.setToolTipText("Height");
                    input3.setVisible(false);
                    break;
                default:
                    input1.setVisible(false); input2.setVisible(false); input3.setVisible(false);
            }
        });

        // Calculate logic
        calcButton.addActionListener(e -> {
            String selected = (String) shapeList.getSelectedItem();
            shape2 shape = null;
            try {
                switch (selected) {
                    case "Square":
                        double side = Double.parseDouble(input1.getText());
                        shape = new square(side);
                        break;
                    case "Rectangle":
                        double l = Double.parseDouble(input1.getText());
                        double b = Double.parseDouble(input2.getText());
                        shape = new rectangle(l, b);
                        break;
                    case "Circle":
                        double r = Double.parseDouble(input1.getText());
                        shape = new circle(r);
                        break;
                    case "Triangle":
                        double a = Double.parseDouble(input1.getText());
                        double b1 = Double.parseDouble(input2.getText());
                        double c = Double.parseDouble(input3.getText());
                        shape = new triangle(a, b1, c);
                        break;
                    case "Trapezium":
                        double base = Double.parseDouble(input1.getText());
                        double height = Double.parseDouble(input2.getText());
                        shape = new trapezium(base, height);
                        break;
                    default:
                        JOptionPane.showMessageDialog(frame, "Please select a shape.");
                        return;
                }

                resultLabel.setText(String.format("Area: %.2f, Perimeter: %.2f", shape.area(), shape.perimeter()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numeric values.");
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
