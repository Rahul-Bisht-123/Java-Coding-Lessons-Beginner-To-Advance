package advance_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsCollection {
  public static void main(String[] args) {
    
    Set<Integer> set =  new HashSet<>();
    set.add(10);
    set.add(12);
    set.add(366);
    set.add(14);
    set.add(5);
    System.out.println(set);  //[5, 10, 12, 366, 14] (Hashset does not maintain order/index)


    Iterator<Integer> it =set.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    /* 5
      10
      12
      366
      14 
      */


    Set<Integer> treeSet =  new TreeSet<>();
    treeSet.add(20);  
    treeSet.add(220);  
    treeSet.add(10);  
    treeSet.add(210);  

    System.out.println(treeSet); //[10, 20, 210, 220]
    //(treeset will sort the values in ascending order)

    Iterator<Integer> it2 = treeSet.iterator();
    while(it2.hasNext()){
      System.out.println(it2.next());
    }
      /*
      10
      20
      210
      220 
      */
  }
}
