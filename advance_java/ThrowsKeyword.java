package advance_java;

public class ThrowsKeyword {
  public static void main(String[] args) {
    
    String s1 = "123";
    String s2 = "abc";

    try {
      int r1 = parseNumber(s1);
      System.out.println(r1); //123

      int r2 = parseNumber(s2); // this wil cause number format exception.
      System.out.println(r2);
      // Error -> java.lang.NumberFormatException: For input string: "abc"
      
    } catch (NumberFormatException e) {
      System.out.println("Error -> " + e);
    }
  }

  static int parseNumber(String str) throws NumberFormatException{
    return Integer.parseInt(str);
  }
}

