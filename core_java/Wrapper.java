package core_java;

public class Wrapper {
  public static void main(String[] args) {
    
    int num1 = 10;
    Integer num2 = num1;  // auto-boxing
    System.out.println(num2); //10

    int num3 = num2; // auto-unboxing
    System.out.println(num3); //10

    //changing string number into int
    String num4 = "12";
    int num5 = Integer.parseInt(num4);
    System.out.println(num5 + 1); //13
  }
  
}
