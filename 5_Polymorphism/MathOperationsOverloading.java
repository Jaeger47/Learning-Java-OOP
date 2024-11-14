class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MathOperationsOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Add integers: " + math.add(5, 10));
        System.out.println("Add doubles: " + math.add(5.5, 10.5));
    }
}
