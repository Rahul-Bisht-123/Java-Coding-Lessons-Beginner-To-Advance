package advance_java;

import java.util.Arrays;
import java.util.List;

public class MethodReferance {
  public static void main(String[] args) {
    
    List<String> names = Arrays.asList("tim","kim","leo");
    //capitalize each letter in name
    List<String>uNames = names.stream() 
                              .map(str->str.toUpperCase())   
                              .toList();

    System.out.println(uNames);  //[TIM, KIM, LEO]


    List<String> names2 = Arrays.asList("tim","kim","leo");
    //capitalize each letter in name
    List<String>uNames2 = names2.stream() 
                              .map(String::toUpperCase)    //method reference
                              .toList();

    System.out.println(uNames2);  //[TIM, KIM, LEO]

    List<String> names3 = Arrays.asList("tim","kim","leo");
    //capitalize each letter in name
    List<String>uNames3 = names3.stream() 
                              .map(String::toUpperCase)   //method reference
                              .toList();

    // System.out.println(uNames3);  //[TIM, KIM, LEO]
    // uNames3.forEach(name->System.out.print(name + ","));  //TIM,KIM,LEO,
    uNames3.forEach(System.out::println);
    /*TIM
      KIM
      LEO 
    */
  }
}
