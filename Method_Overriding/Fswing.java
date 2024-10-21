import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Fswing implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton jb1, jb2, jb3;
    JLabel jl;

    Fswing() {
        // Create the frame
        JFrame jf = new JFrame("Compute");
        jf.setSize(300, 300);
        jf.setLayout(new FlowLayout());

        // Create the text fields
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);

        // Add text fields to the frame
        jf.add(tf1);
        jf.add(tf2);
        jf.add(tf3);

        // Create buttons and add action listeners
        jb1 = new JButton("Sum");
        jb1.addActionListener(this);

        jb2 = new JButton("Avg");
        jb2.addActionListener(this);

        jb3 = new JButton("Largest");
        jb3.addActionListener(this);

        // Add buttons to the frame
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);

        // Create a label and add to the frame
        jl = new JLabel("Select your choice!");
        jf.add(jl);

        // Set frame visibility and default close operation
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Handle button click events
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double c = Double.parseDouble(tf3.getText());
            double largest;

            // Check which button was pressed
            if (e.getActionCommand().equals("Sum")) {
                JOptionPane.showMessageDialog(null, "Sum: " + (a + b + c));
            } else if (e.getActionCommand().equals("Avg")) {
                JOptionPane.showMessageDialog(null, "Average: " + ((a + b + c) / 3));
            } else {
                // Calculate the largest number
                if (a >= b && a >= c)
                    largest = a;
                else if (b >= a && b >= c)
                    largest = b;
                else
                    largest = c;

                JOptionPane.showMessageDialog(null, "Largest: " + largest);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Fswing(); // Create and display the GUI
    }
}
