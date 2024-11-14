class Greeting {
    void sayHello() {
        class LocalInner {
            void greet() {
                System.out.println("Hello from local inner class");
            }
        }
        LocalInner inner = new LocalInner();
        inner.greet();
    }
}

public class LocalAndAnonymousClasses {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.sayHello();
    }
}
