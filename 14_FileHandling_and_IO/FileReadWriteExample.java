import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, World!");
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
