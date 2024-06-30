package core_java;

public class Arrayss {
  public static void main(String[] args) {
    
    int marks[] = {1,2,3,4,5};

    System.out.println(java.util.Arrays.toString(marks)); // [1, 2, 3, 4, 5]

    System.out.println(marks[0]);  //1
    System.out.println(marks[1]);  //2
    System.out.println(marks[2]);  //3
    System.out.println(marks[3]);  //4
    System.out.println(marks[4]);  //5


    marks[0] = 99;
    System.out.println(java.util.Arrays.toString(marks)); // [99, 2, 3, 4, 5]
    System.out.println(marks[0]);  //99
  }
  
}
