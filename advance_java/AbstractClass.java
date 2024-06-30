package advance_java;

//abstract method has no body
//abstract method must be declared in an abstarct class
//We can not create object of an abstract class
//any child class must define all the abstract methods body

public class AbstractClass {
  public static void main(String[] args) {
    
    Car car = new BMW();
    car.drive();  //Driving car...
    car.fly();    //flying car...

  }
  
}

abstract class Car {

  void drive(){
    System.out.println("Driving car...");
  }
  abstract void fly();
}

class BMW extends Car{

  void fly() {
   System.out.println("flying car...");
  }

}