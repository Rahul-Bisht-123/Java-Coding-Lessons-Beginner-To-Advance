package core_java;

public class ClassAndObjects {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    int result = calc.add(3, 2);
    System.out.println(result);

  }
}
class Calculator{

  int add(int num1 , int num2){
    return num1+num2;
  }
}