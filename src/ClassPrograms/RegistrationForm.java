package ClassPrograms;

import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {
    TextField name, email, password;
    Button submit;

    public RegistrationForm() {
        setLayout(new FlowLayout());
        
        Label nameLabel = new Label("Name:");
        add(nameLabel);
        name = new TextField(20);
        add(name);
        
        Label emailLabel = new Label("Email:");
        add(emailLabel);
        email = new TextField(20);
        add(email);
        
        Label passwordLabel = new Label("Password:");
        add(passwordLabel);
        password = new TextField(20);
        password.setEchoChar('*');
        add(password);
        
        submit = new Button("Submit");
        add(submit);
        
        submit.addActionListener(this);
        
        setTitle("Registration Form");
        setSize(300, 150);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String userName = name.getText();
            String userEmail = email.getText();
            String userPassword = password.getText();
            
            // You can add code here to do something with the submitted data
            // For now, let's just print it to the console
            System.out.println("Name: " + userName);
            System.out.println("Email: " + userEmail);
            System.out.println("Password: " + userPassword);
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

