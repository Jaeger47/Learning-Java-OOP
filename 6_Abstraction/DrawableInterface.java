interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class DrawableInterface {
    public static void main(String[] args) {
        Drawable drawable = new Rectangle();
        drawable.draw();
    }
}
