package advance_java;

public class EnumClass {
  public static void main(String args[]) {
    
    Phone p1 = Phone.Iphone;
    System.out.println(p1 + " : " + p1.getCost()); //Iphone : 2000

    System.out.println("-------------------------------");

    for(Phone p : Phone.values()){
      System.out.println("Phone Name : " + p + " - Cost : $" + p.getCost());
    }

    /*
     output :
     Phone Name : Vivo - Cost : $1000
     Phone Name : Oppo - Cost : $1500
     Phone Name : Iphone - Cost : $2000
     Phone Name : Samsung - Cost : $500

     */
    
  }
}

enum Phone{
  Vivo(1000) , Oppo(1500) , Iphone(2000) , Samsung;
  private int cost;

  //default constructor 
  private Phone(){
    cost = 500;
  }

  //parameterized constructor
  private Phone(int cost){
    this.cost = cost;
  }

  //getters and setters
  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

}