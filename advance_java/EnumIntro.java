package advance_java;

public class EnumIntro {

  enum States {
    Running, Completed, Failed, Starting;
  }

  public static void main(String[] args) {

    States s1 = States.Starting;
    States s2 = States.Running;
    States s3 = States.Completed;
    States s4 = States.Failed;

    System.out.println(s1); // Starting
    System.out.println(s2); // Running
    System.out.println(s3); // Completed
    System.out.println(s4); // Failed


    States states[] = States.values();

    for(States state : states){
      System.out.println(state + " : " + state.ordinal());
    }

    //output : 
//    Running : 0
//    Completed : 1
//    Failed : 2
//    Starting : 3

  }
}