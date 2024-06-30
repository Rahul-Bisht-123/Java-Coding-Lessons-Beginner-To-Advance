package advance_java;

// class1 extends class2
// interface1 extends interface2
// class1 implements interface1 or more

public class InterfaceInfo implements A{

  public static void main(String[] args) {
    A obj = new InterfaceInfo();

    obj.method1(); //in method1..
    obj.method2(); //in method2..
  }

  public void method1() {
    System.out.println("in method1..");
  }

  public void method2() {
   System.out.println("in method2...");
  }
  
}

interface A {
  void method1();
  void method2();
}