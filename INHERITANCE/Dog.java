package INHERITANCE;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is Barking...");
    }

    void eat() {
        System.out.println(name + " is eating...");
        super.eat();
    }
}