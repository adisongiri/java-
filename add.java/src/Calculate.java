import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.MathContext;

public class  Calculate implements ActionListener {
    static JFrame frame = new JFrame("CALCULATOR");
    static JLabel label = new JLabel();
    static JLabel label1 = new JLabel();
    static JLabel label2 = new JLabel();
    static JButton button = new JButton();
    static JButton button1 = new JButton();
    static JTextField textField = new JTextField();
    static JTextField textField1 = new JTextField();
    static JTextField textField2 = new JTextField();


    //public class Main {
    public static void main(String[] args) {
        frame.setTitle("calculate");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        label.setText("first number");
        label.setBounds(10, 10, 100, 50);
        frame.add(label);
        label1.setText("second number");
        label1.setBounds(10, 60, 100, 50);
        frame.add(label1);
        label2.setText("Result");
        label2.setBounds(10, 110, 100, 50);
        frame.add(label2);
        textField.setBounds(120, 10, 100, 50);
        frame.add(textField);
        textField1.setBounds(120, 60, 100, 50);
        frame.add(textField1);
       textField2.setBounds(120, 110, 100, 50);
        frame.add(textField2);
        Calculate obj = new Calculate();
        obj.button();


    }

    private void button() {
        button.setText("ok");
        button.setBounds(50, 250, 100, 50);
        frame.add(button);
        button.addActionListener(this);
        button1.setText("exit");
        button1.setBounds(200, 250, 100, 50);
        frame.add(button1);
       button1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int num1 = Integer.parseInt(textField.getText());
            int num2 = Integer.parseInt(textField1.getText());
            int num3 = num1 + num2;
            textField2.setText(String.valueOf(num3));

        }
        if (e.getSource() == button1) {
            System.exit(0);

        }
    }
}


