package core_java;

public class StringBufferClass {
  public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.length()); // 0
    System.out.println(sb.capacity()); // 16
    
    sb.append("King");
    System.out.println(sb);  // King
    System.out.println(sb.length()); // 4
    System.out.println(sb.capacity()); // 16
  
  }
  
}
