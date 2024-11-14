class StaticExample {
    static int value;

    static {
        value = 100;
        System.out.println("Static block executed, value = " + value);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed, value = " + value);
    }
}
