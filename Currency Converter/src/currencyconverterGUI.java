import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.util.HashMap;

public class currencyconverterGUI extends JFrame {
    private JComboBox<String> fromCurrencyBox, toCurrencyBox;
    private JTextField amountField;
    private JLabel resultLabel;
    private HashMap<String, Double> rates = new HashMap<>();

    public currencyconverterGUI() {
        setTitle("Currency Converter");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));
        setLocationRelativeTo(null);

        // Initialize currency rates
        initializeRates();

        // GUI components
        JLabel fromLabel = new JLabel("From Currency:");
        JLabel toLabel = new JLabel("To Currency:");
        JLabel amountLabel = new JLabel("Amount:");
        resultLabel = new JLabel("Result will appear here");

        fromCurrencyBox = new JComboBox<>(rates.keySet().toArray(new String[0]));
        toCurrencyBox = new JComboBox<>(rates.keySet().toArray(new String[0]));

        amountField = new JTextField();

        JButton convertBtn = new JButton("Convert");

        convertBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        // Add components to the frame
        add(fromLabel);
        add(fromCurrencyBox);
        add(toLabel);
        add(toCurrencyBox);
        add(amountLabel);
        add(amountField);
        add(new JLabel()); // Spacer
        add(convertBtn);
        add(new JLabel()); // Spacer
        add(resultLabel);
    }

    private void initializeRates() {
        rates.put("USD", 1.0);       // Base
        rates.put("PKR", 278.5);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.79);
        rates.put("INR", 83.2);
        rates.put("SAR", 3.75);
    }

    private void convertCurrency() {
        try {
            String from = (String) fromCurrencyBox.getSelectedItem();
            String to = (String) toCurrencyBox.getSelectedItem();
            double amount = Double.parseDouble(amountField.getText());

            if (!rates.containsKey(from) || !rates.containsKey(to)) {
                resultLabel.setText("Invalid currency selected.");
                return;
            }

            double usd = amount / rates.get(from);
            double converted = usd * rates.get(to);

            resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, from, converted, to));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            currencyconverterGUI app = new currencyconverterGUI();
            app.setVisible(true);
        });
    }
}
