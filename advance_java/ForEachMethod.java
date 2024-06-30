package advance_java;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
  
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
    System.out.println(nums);  //[1, 2, 3, 4, 5, 6, 7]

    nums.forEach(num -> {
      System.out.print(num + ", ");   //1, 2, 3, 4, 5, 6, 7, 
    });
   
    System.out.println();

    nums.forEach(num -> {
      num = num*2;
      System.out.print(num + ", ");  //2, 4, 6, 8, 10, 12, 14,
    });
    
    
  }
}
