package advance_java;

public class InnerClass {

  void doSomething(){
    System.out.println("doing something...");
  }

  class B{
    void cooking(){
      System.out.println("Cooking in class B...");
    }
  }

  public static void main(String[] args) {
    
    InnerClass innerClass =  new InnerClass();
    innerClass.doSomething(); // doing something...

    InnerClass.B objB = innerClass.new B();
    objB.cooking(); // Cooking in class B...
  }
  
}
