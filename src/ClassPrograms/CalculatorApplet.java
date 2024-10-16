package ClassPrograms;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Create a class extending Applet
public class CalculatorApplet extends Applet implements ActionListener {

    // Declare components
    TextField display;
    Button buttons[];

    // Initialization method
    public void init() {
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
                // Evaluate the expression
                try {
                    String expression = display.getText();
                    double result = evaluateExpression(expression);
                    display.setText(Double.toString(result));
                } catch (ArithmeticException ex) {
                    display.setText("Error");
                }
                break;
            default:
                display.setText(display.getText() + label);
                break;
        }
    }

    // Method to evaluate the expression
    private double evaluateExpression(String expression) {
        // Using ScriptEngine for simplicity, you can implement your own expression parser here
        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            return (double) engine.eval(expression);
        } catch (javax.script.ScriptException e) {
            throw new ArithmeticException("Invalid Expression");
        }
    }
}
