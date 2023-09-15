package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Form");
        frame.setVisible(true);
        frame.setSize(600, 400);//set the default dimensions of the modal to 600x400

        frame.setLayout(new FlowLayout());//set the layout to a horizontally centered layout

        //create and append fields to the frame layout
        JLabel usernameLabel = new JLabel("username");
        frame.add(usernameLabel);

        JTextField usernametextField = new JTextField(20);
        frame.add(usernametextField);

        JLabel passwordLabel = new JLabel("Password");
        frame.add(passwordLabel);

        JTextField passwordTextField = new JTextField(20);
        frame.add(passwordTextField);

        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);
    }
}
