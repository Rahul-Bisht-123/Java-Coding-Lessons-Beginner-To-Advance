package advance_java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalClass {
  public static void main(String[] args) {
    
    List<String> names = Arrays.asList("John" , "Tim" ,"Cane");

    //way1
    Optional<String> x = names.stream() 
    .filter(n->n.contains("i"))
    .findFirst();

    System.out.println(x.orElse("Not found"));

    //way2
    List<String> names2 = Arrays.asList("John" , "Tim" ,"Cane");

    String x2 = names2.stream() 
                              .filter(n->n.contains("po"))
                              .findFirst()
                              .orElse("Not Found haha");

    System.out.println(x2); 
  }
}
