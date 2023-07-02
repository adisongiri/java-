import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
public  class Calculate1 implements ActionListener {
 static JFrame frame = new JFrame("Calculate");
    static JLabel lbl = new JLabel();
    static JLabel lbl2 = new JLabel();
   static JLabel lbl3 = new JLabel();
   static JLabel lbl4 = new JLabel();
   static JButton btn1 = new JButton();
 static JButton btn2 = new JButton();
   static JTextField tf1 = new JTextField();
   static JTextField tf2 = new JTextField();
   static JTextField tf3 = new JTextField();


    public static void main(String[] args) {
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //it closes the whole operation while closing
        frame.setVisible(true);
        frame.setLayout(null);
        lbl.setText("Calculate");
        lbl.setBounds(10,10,100,50);
        frame.add(lbl); //this code adds label in the frame
        lbl2.setText("first number");
        lbl2.setBounds(10 60 100 50);
        frame.add(lbl2);
        lbl3.setText("second number");
        lbl3.setBounds(10 110 100 50);
        frame.add(lbl3);
        lbl4.setText("result");
        lbl4.setBounds(10 160 100 50);
        frame.add(lbl4);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==btn1)
    }
}