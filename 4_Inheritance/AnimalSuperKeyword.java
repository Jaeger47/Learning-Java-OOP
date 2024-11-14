class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void printName() {
        System.out.println(super.name);
        System.out.println(name);
    }
}

public class AnimalSuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printName();
    }
}
