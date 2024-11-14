class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }

    static void showCount() {
        System.out.println("Total Count: " + count);
    }
}

public class CounterStaticExample {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.showCount();
    }
}
