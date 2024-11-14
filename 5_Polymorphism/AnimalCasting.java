class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }

    void scratch() {
        System.out.println("Cat scratches");
    }
}

public class AnimalCasting {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.scratch();
        }
    }
}
