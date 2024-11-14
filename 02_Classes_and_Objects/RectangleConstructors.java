class Rectangle {
    int width, height;

    Rectangle() {
        width = 10;
        height = 20;
    }

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
}

public class RectangleConstructors {
    public static void main(String[] args) {
        Rectangle defaultRect = new Rectangle();
        System.out.println("Default Rectangle: " + defaultRect.width + "x" + defaultRect.height);

        Rectangle customRect = new Rectangle(15, 25);
        System.out.println("Custom Rectangle: " + customRect.width + "x" + customRect.height);
    }
}
