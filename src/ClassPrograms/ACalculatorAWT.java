package ClassPrograms;

import java.awt.*;
import java.awt.event.*;

public class ACalculatorAWT extends Frame implements ActionListener {

    // Declare components
    TextField display;
    Button buttons[];

    // Constructor
    public ACalculatorAWT() {
        // Set layout to GridLayout
        setLayout(new BorderLayout());

        // Create display TextField and add to BorderLayout.NORTH
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create buttons panel with GridLayout
        Panel buttonsPanel = new Panel(new GridLayout(4, 4));
        
        // Button labels
        String buttonLabels[] = {"7", "8", "9", "/",
                                  "4", "5", "6", "*",
                                  "1", "2", "3", "-",
                                  "C", "0", "=", "+"};

        // Create buttons and add to panel
        buttons = new Button[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonsPanel.add(buttons[i]);
        }

        // Add buttons panel to BorderLayout.CENTER
        add(buttonsPanel, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Calculator");
        setSize(300, 300);
        setVisible(true);

        // Add window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // close the frame
            }
        });
    }

    // Action performed method
    public void actionPerformed(ActionEvent e) {
        // Get the source of the event
        Button btn = (Button) e.getSource();

        // Get the label of the button clicked
        String label = btn.getLabel();

        // Handle each button click
        switch (label) {
            case "C":
                display.setText("");
                break;
            case "=":
                evaluateExpression();
                break;
            default:
                display.setText(display.getText() + label);
                break;
        }
    }

    // Method to evaluate the expression
    private void evaluateExpression() {
        String expression = display.getText();
        double result = 0;

        // Initialize variables to store the operands and operator
        double num1 = 0;
        double num2 = 0;
        String operator = "";

        // Iterate through the expression to find the operator
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Found the operator
                operator = Character.toString(ch);
                // Extract operands
                num1 = Double.parseDouble(expression.substring(0, i));
                num2 = Double.parseDouble(expression.substring(i + 1));
                break;
            }
        }

        // Perform the arithmetic operation based on the operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    display.setText("Error");
                    return;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                display.setText("Error");
                return;
        }

        // Update the display with the result
        display.setText(Double.toString(result));
    }

    // Main method to create instance of ACalculatorAWT
    public static void main(String[] args) {
        new ACalculatorAWT();
    }
}

