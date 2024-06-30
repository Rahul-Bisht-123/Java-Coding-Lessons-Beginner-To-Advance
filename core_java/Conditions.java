package core_java;

public class Conditions {
  public static void main(String[] args) {
    int a = 1000;
    int b = 200;
    int c = 30;

    if(a>b && a>c){
      System.out.println("A is greatest of all");
    }
    else if(b>a && b>c){
      System.out.println("B is greatest of all");
    }
    else{
      System.out.println("C is greatest of all");
    }
  }
}
