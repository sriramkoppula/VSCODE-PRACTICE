

class Student{
  String name;
  int age;
  String course;
  Student(String name,int age,String course){
    this.name=name;
    this.age=age;
    this.course=course;
  }
  void display(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(course);
    System.out.println("--------");
  }
}
class Main{
public static void main(String[] args){
  Student s1=new Student("RAM",20,"JAVA");
  Student s2=new Student("SRI",20,"DSA");

 s1.display();
 s2.display();
  }
}