import javax.swing.*;

public class SwingBasicComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(10);

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
