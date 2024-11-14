class CustomExceptionExample {
    void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
    }
}

public class ThrowExample {
    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();
        example.checkAge(16);
    }
}
