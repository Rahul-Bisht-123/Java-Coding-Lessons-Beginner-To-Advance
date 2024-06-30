package core_java;

public class Methods {
  public static void main(String[] args) {
    Computer comp = new Computer();

    comp.playGame();
    comp.playMusic();
    
  }
}

class Computer{
  //method1
  void playMusic(){
    System.out.println("Playing Music..🎸");
  }

  //method2
  void playGame(){
    System.out.println("Playing Game.. 🎮");
  }
}