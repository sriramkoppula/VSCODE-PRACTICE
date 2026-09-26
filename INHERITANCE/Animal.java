package INHERITANCE;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is Eating...");
    }

    void sleep() {
        System.out.println(name + " is Sleeping...");
    }
}