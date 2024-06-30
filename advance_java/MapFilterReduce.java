package advance_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilterReduce {
  public static void main(String[] args) {
    
    List<Integer> evenNumbers = Arrays.asList(1,2,3,4,5,6);
    System.out.println(evenNumbers);  // [1, 2, 3, 4, 5, 6]

    // Stream<Integer> s1 = evenNumbers.stream().filter(n->n%2==0);
    // // s1.forEach(n->System.out.print(n+", ")); //2, 4, 6, 
    // System.out.println();

    // Stream<Integer> s2 = s1.map(n -> n*2);
    // // s2.forEach(n->System.out.print(n+", ")); // 4, 8, 12, 
    // System.out.println();

    // int r = s2.reduce(0 , (carry,nextValue) -> carry + nextValue); 
    // System.out.println(r);  //24

    List<Integer> numbers = Arrays.asList(40,3,1,66,6);

    Stream<Integer> sortedValues = numbers.stream().sorted();

    sortedValues.forEach(n->System.out.print(n+", ")); // 1, 3, 6, 40, 66,


    int result = evenNumbers.stream()
              .filter(n -> n%2==0)  // filter all the even numbers from prev stream.
              .map(n-> n*2)         // map each number such that each will mupliply by 2
              .reduce(0,(carry,digit)->carry+digit);


    System.out.println("---------------------------");
    System.out.println("Result = " + result); //24
    System.out.println("---------------------------");
  }
}
