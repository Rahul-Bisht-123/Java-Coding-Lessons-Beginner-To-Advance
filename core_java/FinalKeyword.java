package core_java;

// final variable value can not be changed.
// final class can not be extended to other classes.
// final method can not be over ride.

public class FinalKeyword {
  public static void main(String[] args) {
    
    final double PI = 3.14;
    // PI = 3.45; (reassigning PI will gives error)
    System.out.println(PI);


  }
  
}
final class A{
  final void show(){
    System.out.println("in class a show");
  }
}

// class B extends A{
//   void show(){
//     System.out.println("in class a show");
//   }
// }