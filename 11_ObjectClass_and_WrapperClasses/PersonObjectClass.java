class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class PersonObjectClass {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        System.out.println(p1);
        System.out.println("Are p1 and p2 equal? " + p1.equals(p2));
    }
}
