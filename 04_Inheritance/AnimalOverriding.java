class Animal {
    void sound() {
        System.out.println("This is an animal sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class AnimalOverriding {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound();
    }
}
