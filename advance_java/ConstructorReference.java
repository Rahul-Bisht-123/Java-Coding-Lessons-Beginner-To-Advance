package advance_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorReference {
  public static void main(String[] args) {
    
    List<String> freshersList = Arrays.asList("John","Jin","Kim");
    List<Employee> employees = new ArrayList<>();

    // employees = freshersList.stream() 
    // .map(name -> new Employee(name))  
    // .toList();

    // System.out.println(employees); //[Employee [name=John, id=101], Employee [name=Jin, id=101], Employee [name=Kim, id=101]]

    employees = freshersList.stream() 
                            .map(Employee::new)    //constructor reference
                            .toList();
    employees.forEach(System.out::println);  //function reference
    /* 
      Employee [name=John, id=101]
      Employee [name=Jin, id=101]
      Employee [name=Kim, id=101]
    */
  }
}

class Employee{
  private String name;
  private int id;

  public Employee(String name){
    this.name = name;
    id = 101;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", id=" + id + "]";
  }
  
}