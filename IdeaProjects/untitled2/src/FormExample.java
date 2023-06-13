import javax.swing.*;

public class FormExample {
    public static void main(String[] args) {
        // Create a JFrame (window) to hold the form
        JFrame frame = new JFrame("Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create the form components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel PhoneNumberLabel = new JLabel("Phonenumber:");
        JTextField PhoneNumberField = new JTextField(15);
        JButton submitButton = new JButton("Submit");


        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(PhoneNumberLabel);
        panel.add(PhoneNumberField);
        panel.add(submitButton);

        // Add the panel to the frame
        frame.add(panel);

        // Display the form
        frame.setVisible(true);
    }
}
