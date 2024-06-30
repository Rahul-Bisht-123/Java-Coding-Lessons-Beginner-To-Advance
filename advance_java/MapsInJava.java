package advance_java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapsInJava {
  public static void main(String[] args) {
    
    Map<String , Integer> phone_numbers = new HashMap<>();
    phone_numbers.put("Aman", 12345);
    phone_numbers.put("Bob", 23451);
    phone_numbers.put("Cyan", 56789);

    System.out.println(phone_numbers);             // {Cyan=56789, Bob=23451, Aman=12345}
    System.out.println(phone_numbers.keySet());    // [Cyan, Bob, Aman]
    System.out.println(phone_numbers.values());    // [56789, 23451, 12345]
    System.out.println(phone_numbers.entrySet());  // [Cyan=56789, Bob=23451, Aman=12345]
    System.out.println(phone_numbers.size());      // 3

    for(String key : phone_numbers.keySet()){
      System.out.println(key + " : " +phone_numbers.get(key));
    }
    /*
      Cyan : 56789
      Bob : 23451
      Aman : 12345 
      */

      Map<String, Integer> nameMarks = new Hashtable<>();
      nameMarks.put("John", 99);
      nameMarks.put("Joey", 70);
      nameMarks.put("Kai", 88);

      System.out.println(nameMarks);            // {John=99, Kai=88, Joey=70}
      System.out.println(nameMarks.getClass()); // class java.util.Hashtable
      System.out.println(nameMarks.keySet());   // [John, Kai, Joey]
      System.out.println(nameMarks.values());   // [99, 88, 70]

 /*
------------------
When to Use Which
------------------ 
HashMap: Use when you don't need synchronization, and you need better performance. It is more versatile and generally preferred in modern applications.

Hashtable: Use when you need thread safety without external synchronization. However, consider using ConcurrentHashMap as a better alternative for thread-safe operations. */
  }
}
