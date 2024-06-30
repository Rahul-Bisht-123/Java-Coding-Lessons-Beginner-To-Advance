package advance_java;

public class LambdaExpressionReturn {
  public static void main(String[] args) {
    
    // Using an anonymous class
    Calculator calc1 = new Calculator() {
      public int add(int i, int j){
        return i+j;
      }
    };

    // Using Lambda expression
    Calculator calc2 = (int i, int j) -> {
        return i+j;
    };

    
    int r1 = calc1.add(10,20); 
    int r2 = calc2.add(30,20); 

    System.out.println(r1);  // 30
    System.out.println(r2);  // 50
  }
}

interface Calculator{
   int add(int num1 , int num2);
}