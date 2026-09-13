package ENCAPSULATION;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int setAge(int age){
        this.age=age;
        return age;
    }
}
