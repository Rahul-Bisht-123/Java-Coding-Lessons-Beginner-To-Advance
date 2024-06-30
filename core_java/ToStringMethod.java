package core_java;

public class ToStringMethod {
  public static void main(String[] args) {
    
    Employee emp1 = new Employee();
    emp1.setName("Raju");
    emp1.setSalary(1_000_000);
    System.out.println(emp1.toString()); // Employee [name=Raju, salary=1000000]
    
  }
}

class Employee{
  String name;
  int salary;
  
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

  @Override
  public String toString() {
    return "Employee [name=" + name + ", salary=" + salary + "]";
  }

}