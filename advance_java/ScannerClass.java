package advance_java;

import java.util.Scanner;

public class ScannerClass {
  public static void main(String[] args) {
    
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    try{
      int num = sc.nextInt();
      System.out.println("You choosed : " + num);

    }
    finally{
      sc.close();
    }

  }
}
