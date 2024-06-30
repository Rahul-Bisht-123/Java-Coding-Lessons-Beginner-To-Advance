package core_java;

public class Constructors {
  public static void main(String[] args) {
    
    Employee emp1 = new Employee();
    emp1.display();  //Human : 22 (constructor value)

    emp1.setName("John");
    emp1.setAge(55);
    emp1.display(); // John : 55 (setted values)
  }
}

class Employee{
  private String name;
  private int age;

  public Employee(){
    name = "Human";
    age = 22;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  void display(){
    System.out.println(getName() + " : " + getAge());
  }
}