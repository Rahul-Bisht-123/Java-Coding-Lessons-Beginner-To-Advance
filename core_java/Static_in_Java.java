package core_java;

public class Static_in_Java {
  
  public static void main(String[] args) {
    
    Mobile m1 = new Mobile();
    Mobile.name = "Smart Phone";
    m1.brand = "Apple";
    m1.cost = 1300;

    Mobile m2 = new Mobile();
    Mobile.name = "Smart Phone";
    m2.brand = "Samsung";
    m2.cost = 1400;

    m1.show(); // Smart Phone : Apple : $1300
    m2.show(); // Smart Phone : Samsung : $1400

    Mobile.show1(m1);  // Smart Phone : Apple : $1300
    Mobile.show1(m2);  // Smart Phone : Samsung : $1400
  }
}

class Mobile{
  static String name;  //static variable
  String brand; //instance variable
  int cost; //instance variable

  //non-static method
  void show(){
    System.out.println(name + " : " + brand + " : $" + cost);
  }
  //static method
  static void show1(Mobile obj){
    System.out.println(name + " : " + obj.brand + " : $" + obj.cost);
  }
}