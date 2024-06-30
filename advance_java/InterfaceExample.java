package advance_java;

public class InterfaceExample {


  
  public static void main(String[] args) {
    
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer john = new Developer();
    john.code(desk); // coding in desktop..

    Developer nick = new Developer();
    nick.code(lap); // coding in laptop..


  }
}

interface Computer{
  public void code();
}

class Laptop implements Computer{
  public void code(){
    System.out.println("coding in laptop..");
  }
}

class Desktop implements Computer{
  public void code(){
    System.out.println("coding in desktop..");
  }
}

class Developer{

  public void code(Computer comp){
   comp.code();
  }
}