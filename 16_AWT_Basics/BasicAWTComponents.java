import java.awt.*;
import java.awt.event.*;

public class BasicAWTComponents {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");
        Label label = new Label("Enter Name:");
        TextField textField = new TextField(20);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(textField);
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
