import java.awt.*;
import java.awt.event.*;

public class AWTEventHandling {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Event Example");
        Button button = new Button("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked in AWT!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
