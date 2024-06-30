package advance_java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
  public static void main(String[] args) {
    
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

    System.out.println(nums);                // [1, 2, 3, 4, 5]
    System.out.println(nums.size());         // 5
    System.out.println(nums.get(0));   // 1
    System.out.println(nums.indexOf(5));   // 4
    System.out.println(nums.contains(4));  // true
    System.out.println(nums.getFirst());     // 1
    System.out.println(nums.getLast());      // 5
  }

}
