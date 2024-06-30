package advance_java;

public class ThreadsAndRunnable3 {
  
  public static void main(String[] args) {
    Runnable obj_a = () -> {
        for(int i=0;i<5;i++){
          System.out.println("Hi A");
    
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    ;

    Runnable obj_b = () -> {
        for(int i=0;i<5;i++){
          System.out.println("Hello B");
    
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
    };

    Thread t1 = new Thread(obj_a);
    Thread t2 = new Thread(obj_b);

    t1.start();
    t2.start();

  }
}