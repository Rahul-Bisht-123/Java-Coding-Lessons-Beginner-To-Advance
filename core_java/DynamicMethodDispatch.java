package core_java;

public class DynamicMethodDispatch {
  public static void main(String[] args) {
    
    A obj = new A();
    obj.show(); // in A show

    obj = new B();
    obj.show();// in B show

    obj = new C();
    obj.show(); // in C show
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
class C extends A{
  void show(){
    System.out.println("in C show");
  }
}
