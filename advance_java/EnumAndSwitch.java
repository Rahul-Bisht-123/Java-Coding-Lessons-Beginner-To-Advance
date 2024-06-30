package advance_java;

public class EnumAndSwitch {
  
  enum Status{
    Running, Completed, Failed
  }

  public static void main(String[] args) {
    
    Status s = Status.Running;

    switch (s) {
      case Running:
        System.out.println("wait running ...");
        break;
      case Failed:
        System.out.println("oops Failed try again...");
        break;
      case Completed:
        System.out.println("completed success...");
        break;
    }

    //output : wait running ...
  }
}
