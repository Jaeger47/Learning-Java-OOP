class OuterClass {
    int outerValue = 10;

    class InnerClass {
        void display() {
            System.out.println("Outer value from inner class: " + outerValue);
        }
    }

    static class StaticInnerClass {
        void display() {
            System.out.println("Static inner class");
        }
    }
}

public class OuterInnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display();
    }
}
