import java.awt.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        new Login().setVisible(true); // Create and display the login frame
    }
}

class Login extends JFrame {

    public Login() {
        super("Login Bank");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Create labels and text fields
        JLabel userName = new JLabel("Username:");
        userName.setForeground(Color.BLACK);
        JTextField textUser = new JTextField(20);
        textUser.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel password = new JLabel("Password:");
        password.setForeground(Color.BLACK);
        JTextField textPass = new JTextField(20);
        textPass.setFont(new Font("Arial", Font.PLAIN, 18));

        // Configure GridBagConstraints for each component
        constraints.gridx = 0;  // Place component at column 0
        constraints.gridy = 0;  // Place component at row 0 (adjust for vertical placement)
        constraints.anchor = GridBagConstraints.WEST;  // Align label to the left
        panel.add(userName, constraints);

        constraints.gridy = 1;  // Move to the next row
        panel.add(textUser, constraints);

        constraints.gridy = 2;  // Move to the next row
        // constraints.anchor = GridBagConstraints.EAST;  // Align label to the right
        panel.add(password, constraints);

        constraints.gridy = 3;  // Move to the next row
        panel.add(textPass, constraints);

        add(panel);  // Add the panel to the frame
    }
}