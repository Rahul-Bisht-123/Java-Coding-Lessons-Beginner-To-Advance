package advance_java;

public class AbstractAnonymousInnerClass {
  
  public static void main(String[] args) {
    
    //here we are not created object of abstract class A.
    //we creating the object of anonymous inner class
    A obj = new A() 
    {
      void doSomething(){
        System.out.println("doing something...");
      }
    };
    obj.doSomething();  //doing something...
  }
}

abstract class A{
  abstract void doSomething();
}