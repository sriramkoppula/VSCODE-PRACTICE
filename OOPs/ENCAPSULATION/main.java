package ENCAPSULATION;

public class main {
    public static void main(String[] args){
        Student s = new Student("John", 20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        s.setAge(22);
        System.out.println("Updated Age: " + s.getAge());
    }
}
