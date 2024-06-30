package advance_java;

public class ExceptionsClass {
  public static void main(String[] args) {
    
    int i = 5;
    int j = 10;

    try {
      i = i/j;
      if (i==0){
        throw new ArithmeticException("do not divide by zero");
      }
    } 
    catch (ArithmeticException e) {
      i = 5;
      System.out.println("this is the deafult value of i. " + e);
    }
    catch (Exception e) {
      System.out.println("Error");
    }

    System.out.println(i);
    System.out.println("bye..");
  }
}
