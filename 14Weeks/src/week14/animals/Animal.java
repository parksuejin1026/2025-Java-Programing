package week14.animals;

public class Animal {
    String name;
    int age;

    // Constructor fixed (was void return type in original which is wrong for
    // constructor)
    public Animal() {
    } // Default constructor

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
