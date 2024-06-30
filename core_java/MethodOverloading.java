package core_java;

public class MethodOverloading {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    System.out.println(calc.add(1,2));
    System.out.println(calc.add(1,2,3));
  }
}

class Calculator{

  int add(int n1, int n2){
    return n1+n2;
  }

  int add(int n1, int n2, int n3){
    return n1+n2+n3;
  }
}