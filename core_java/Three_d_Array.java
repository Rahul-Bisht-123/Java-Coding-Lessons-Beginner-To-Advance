package core_java;

public class Three_d_Array {
  public static void main(String[] args) {
    
    int[][][] marks = {
      {
        {1,2},{3,4},{5,6}
      },
      {
        {1,2,3,4}, {2,3}
      },
      {
        {1,2,3,4,5,6} , {9,0}
      }
    };

    for(int mark[][] : marks){
      for (int m[] : mark){
        for(int n : m){
           System.out.print(n + " ");
        }
        System.out.println();
      }
    }
  }
}
