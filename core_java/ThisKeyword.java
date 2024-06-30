package core_java;

public class ThisKeyword {
  public static void main(String[] args) {
    
    Employee emp1 = new Employee();
    emp1.setName("John");
    emp1.setSalary(50_000);

    Employee emp2 = new Employee();
    emp2.setName("Joey");
    emp2.setSalary(70_000);

    emp1.show();  // Name : John : Salry = $50000
    emp2.show();  // Name : Joey : Salry = $70000

  }
}

class Employee{

  private String name;
  private int salary;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }

  void show(){
    System.out.println("Name : " + getName() + " : Salry = $" + getSalary() );
  }
}