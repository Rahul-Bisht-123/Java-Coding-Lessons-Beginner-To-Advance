package core_java;

public class ParameterizedConstructor {
  public static void main(String[] args) {

    Phone p1 = new Phone();
    Phone p2 = new Phone("iphone");
    Phone p3 = new Phone("Samsung" , 30_000);
    
    p1.display();  // No Name : $1
    p2.display();  // iphone : $10000
    p3.display();  // Samsung : $30000
  }
}

class Phone{
  private String name;
  private int cost;

  //default constructor
  public Phone() {
    name = "No Name";
    cost = 1;
  }

  //parameterized constructor (takes only name)
  public Phone(String name) {
    this.name = name;
    cost = 10_000;
  }

  //parameterized constructor (takes both name and cost)
  public Phone(String name, int cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getCost() {
    return cost;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }
  
  void display(){
    System.out.println(getName() + " : $" + getCost());
  }
}