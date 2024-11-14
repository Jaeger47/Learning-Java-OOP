class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.age = 20;
        student.displayInfo();
    }
}
