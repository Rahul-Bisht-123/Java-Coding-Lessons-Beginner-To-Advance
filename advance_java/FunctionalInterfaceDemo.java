package advance_java;

// functional interface is a type of interface which can only have single abstarct method.


@FunctionalInterface
interface A {void show();}

public class FunctionalInterfaceDemo{
  public static void main(String[] args) {
    
    A obj = new A() 
    {
      public void show()
      {
        System.out.println("in show");
      }
    };
    
    obj.show(); //in show
  }

}
