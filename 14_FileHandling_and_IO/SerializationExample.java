import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            Person person = new Person("John", 30);
            out.writeObject(person);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) in.readObject();
            System.out.println("Deserialized Person: " + person.name + ", Age: " + person.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
