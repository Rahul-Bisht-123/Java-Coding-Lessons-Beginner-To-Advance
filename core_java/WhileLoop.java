package core_java;

public class WhileLoop {
  public static void main(String[] args) {
    int counter1 = 1;

    while(counter1<4){
      System.out.println("Hi " + counter1);

      int counter2 = 1;
      while ((counter2 < 3)) {
        System.out.println("Hello " + counter2);
        counter2++;
      }

      counter1++;
    }
  }
}
