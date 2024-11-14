class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}

class Product {
    void checkProduct(String product) throws InvalidProductException {
        if (product == null || product.isEmpty()) {
            throw new InvalidProductException("Product cannot be null or empty");
        }
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Product product = new Product();
        try {
            product.checkProduct("");
        } catch (InvalidProductException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
