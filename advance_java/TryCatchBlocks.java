package advance_java;

public class TryCatchBlocks {
  
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int result = 0;

    try
    {
      result = i/j;
    }
    catch(Exception e){
        System.out.println("Error -> "+ e);
    }

    System.out.println(result);
    System.out.println("Bye..");
    
  }
}
