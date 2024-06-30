package core_java;

public class AnonymousObject {
  public static void main(String[] args) {
    
    new A();
    //output : Inside constructor
  }
}

class A{

  public A(){
    System.out.println("Inside constructor");
  }

}