package advance_java;

/*
- lambda expressions are commonly used with functional interfaces.
- It has three parts:
      parameter list ()
      arrow ->
      body { }

 ex : 
      (int i , int j) -> { 
        return i+j;
      };

*/

public class LambdaExpressions {
  public static void main(String[] args) {
    
    //Using an anonymous class
    Human h1 = new Human() {
      @Override
      public void greet(){
        System.out.println("greeting using anonymous class..");
      }
    };

    // Using lambda expression

    Human h2 = () -> {System.out.println("greeting using lambda expression..");};


    h1.greet(); // greeting using anonymous class..
    h2.greet(); // greeting using lambda expression..
  }
}

@FunctionalInterface
interface Human{
  void greet();
}