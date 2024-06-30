package core_java;

//encapsulation is making the instace varibales as private and accessing them using the get and set methods.
public class Encapsulation {
  public static void main(String[] args) {
    Animal obj1 =  new Animal();
    obj1.setName("Lion");
    obj1.setCost(300);

    System.out.println(obj1.getName()); //Lion
    System.out.println(obj1.getCost()); //300

    Animal obj2 =  new Animal();
    obj2.setName("Tiger");
    obj2.setCost(500);

    System.out.println(obj2.getName());  //Tiger
    System.out.println(obj2.getCost());  //500
    
  }
}

class Animal{
  private String name;
  private int cost;

  String getName(){
    return name;
  }
  void setName(String n){
    name = n;
  }

  int getCost(){
    return cost;
  }
  void setCost(int c){
    cost = c;
  }
}