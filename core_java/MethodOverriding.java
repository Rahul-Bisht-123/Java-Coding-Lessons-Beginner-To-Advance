package core_java;

//method over riding hapens when we re-define a function from parent class in the child class
public class MethodOverriding {
  public static void main(String[] args) {
    
    new B().show();  //in B show
  }
}

class A{

  void show(){
    System.out.println("in A show");
  }
}

class B extends A{

  void show(){
    System.out.println("in B show");
  }
}