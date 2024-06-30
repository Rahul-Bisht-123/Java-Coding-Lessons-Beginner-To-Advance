package core_java;


public class Two_D_Array {
  public static void main(String[] args) {
    
    int student1[] = {10,20,30};
    int student2[] = {20,40,60};
    int student3[] = {12,24,36};
    
    int students[][] = {student1, student2,student3};
   
    for(int[] std : students){
      System.out.println(java.util.Arrays.toString(std));
    }
    /*
     [10, 20, 30]
     [20, 40, 60]
     [12, 24, 36]
     */


    int students2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

    for(int[] std : students2){
      System.out.println(java.util.Arrays.toString(std));
    }

    /*
     [1, 2, 3]
     [4, 5, 6]
     [7, 8, 9]
     */
  }
}
