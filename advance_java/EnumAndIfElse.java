package advance_java;

public class EnumAndIfElse {
  
  enum Colors{
    Red, Green, Yellow;
  }
  public static void main(String[] args) {
    
    Colors c = Colors.Yellow;

    if(c == Colors.Green){
      System.out.println("Go");
    }
    else if(c == Colors.Yellow){
      System.out.println("Start Engine");
    }
    else{
      System.out.println("Stop Engine");
    }
    
    // output : Start Engine
  }
}
