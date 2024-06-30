package core_java;

public class DoWhileLoop {
  public static void main(String[] args) {
    
    int counter1 = 4;

    do{
      System.out.println("Hi " + counter1);
      counter1++;
    }while (counter1<=3);
  }
}
//Here the while condition is false but still the 'do' will run one time and prints : Hi 4