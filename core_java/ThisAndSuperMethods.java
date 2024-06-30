package core_java;

//this() : calls the constructor of current class
//super() : calls the constructor of parent class

// NOTE : 
// Each constructor by default has super() method
// Each class by default extends Object class(if its not extending any other class).

public class ThisAndSuperMethods {
  public static void main(String[] args) {
    
    new B(5);
    /* output: 
     in A
     in B
     in B String
     in B int
     */
  }
  
}

class A{
  public A(){
    super();
    System.out.println("in A");
  }

  public A(int n){
    super();
    System.out.println("in A int");
  }
}

class B extends A{
  public B(){
    super();
    System.out.println("in B");
  }

  public B(int n){
    this("hey");
    System.out.println("in B int");
  }

  public B(String n){
    this();
    System.out.println("in B String");
  }
}