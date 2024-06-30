package advance_java;

public class AnnotationsClass extends Car{
  public static void main(String[] args) {
    
    AnnotationsClass obj1 = new AnnotationsClass();
    obj1.drive(); // driving crazy...

    Car obj2 = new Car();
    obj2.drive(); // driving slowly..

    SuperCar obj3 = new SuperCar();
    obj3.drive(); // driving fastly..

  }

  @Override
  public void drive(){
    System.out.println("driving crazy...");
  }
}

class Car {
  public void drive(){
    System.out.println("driving slowly..");
  }
}
class SuperCar extends Car{

  @Override
  public void drive(){
    System.out.println("driving fastly..");
  }
}