import javax.swing.*;
import java.awt.*;

public class Java2DGraphicsExample extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 100, 50);
        g.drawString("Hello, Java 2D!", 50, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Graphics Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new Java2DGraphicsExample());
        frame.setVisible(true);
    }
}
