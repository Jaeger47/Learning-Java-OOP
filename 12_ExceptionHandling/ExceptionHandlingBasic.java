public class ExceptionHandlingBasic {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
