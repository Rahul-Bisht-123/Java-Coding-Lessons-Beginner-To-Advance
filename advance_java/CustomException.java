package advance_java;

public class CustomException {
  public static void main(String[] args) {
    
    int result = 0;
    try {
      int numerator = 0;
      int denominator = 10;
      result = numerator / denominator;

      if(numerator == 0)
      {
        throw new MyException("0 as numberator Not Allowed :(");
      }
    } 
    catch (MyException e) {
      result = 0;
      System.out.println("printing default value of result ." + e);

    }

    System.out.println(result);
  }
  
}

class MyException extends Exception{

  public MyException(String s){
    super(s);
  }
}