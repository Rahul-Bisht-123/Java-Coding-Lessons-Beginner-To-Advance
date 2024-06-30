package core_java;

class Mobile{

  static String name;
  String brand;
  int cost;

  public Mobile(){
    cost = 200;
    brand = "not - defined";
    System.out.println("Inside constructor block");

  }

  static{
    name = "Smart Phone";
    System.out.println("Inside static block");
  }
}

public class StaticBlock {
  public static void main(String[] args) throws ClassNotFoundException {
    // for the below two objects(m1,m2) the constructor will be called two times but the static block will be called ones.
    // Mobile m1 = new Mobile();
    // Mobile m2 = new Mobile();

    // output :
    // Inside static block
    // Inside constructor block
    // Inside constructor block


    //but if we only want to call the static block not the constructor we can do the follwoing
    Class.forName("Mobile");
    //output :
    // Inside static block
  }

}
