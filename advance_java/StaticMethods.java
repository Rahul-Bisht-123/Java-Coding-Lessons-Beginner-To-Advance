package advance_java;

public class StaticMethods{
  public static void main(String[] args) {
    
    //no need to create object for calling static methods from same class

    staticMethod(); //in static method..

    //need to create object to call non-static methods.
    StaticMethods obj = new StaticMethods();
    obj.nonStaticMethod();  //in non static method..


    // needs to create object to access static/non-static methods from other class
    A a = new A();

    //call non static methods from other class using the object.
    a.nonStaticA(); // in non static A..

    //call static methods of other classes using the class name
    A.staticA(); // in static A..

  }

  public static void staticMethod(){
    System.out.println("in static method..");
  }
  void nonStaticMethod(){
    System.out.println("in non static method..");
  }


}

class A{

  public void nonStaticA(){
    System.out.println("in non static A..");
  }

  public static void staticA(){
    System.out.println("in static A..");
  }
}