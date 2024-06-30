package advance_java;

public class AnonymousInnerClass {

  void doSomething(){
    System.out.println("doing something normal");
  }
  
  public static void main(String[] args) {
    
    AnonymousInnerClass anonymousInnerClass1 = new AnonymousInnerClass();
    anonymousInnerClass1.doSomething(); // doing something normal

    AnonymousInnerClass anonymousInnerClass2 = new AnonymousInnerClass()
    {
      void doSomething(){
        System.out.println("doing something new..");
      }
    };
    anonymousInnerClass2.doSomething(); // doing something new..

  }
}
