package core_java;

public class Ternary {
  public static void main(String[] args) {
    
    int num = 70;
    String result = null;

  //   if(num%2 == 0){
  //     result = "Even";
  //   }
  //   else{
  //     result = "Odd";
  //   }
  //  System.out.println(result);

  result = num%2==0 ? "Even" : "Odd";
  System.out.println(result);
  }
}
