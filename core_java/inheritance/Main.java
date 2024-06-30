package core_java.inheritance;

public class Main {
  public static void main(String[] args) {
    
    NormalCalculator obj1 = new NormalCalculator();
    int a1 = obj1.addition(10, 40); 
    int a2 = obj1.subtraction(40, 70); 

    System.out.println(a1); // 50
    System.out.println(a2); // -30

    AdvanceCalculator obj2 = new AdvanceCalculator();
    int b1 = obj2.addition(10, 20);
    int b2 = obj2.subtraction(20, 5);
    int b3 = obj2.multiply(10, 20 );
    int b4 = obj2.divide(30, 10);

    System.out.println(b1); // 30
    System.out.println(b2); // 15
    System.out.println(b3); // 200
    System.out.println(b4); // 3

    ScientificCalculator obj3 = new ScientificCalculator();
    int r1 = obj3.addition(10, 20);
    int r2 = obj3.subtraction(20, 5);
    int r3 = obj3.multiply(10, 20 );
    int r4 = obj3.divide(30, 10);
    double r5 = obj3.power(3, 3);

    System.out.println(r1); // 30
    System.out.println(r2); // 15
    System.out.println(r3); // 200
    System.out.println(r4); // 3
    System.out.println(r5); // 27.0

  }
  
}