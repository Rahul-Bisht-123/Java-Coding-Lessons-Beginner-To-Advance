package advance_java;

public class ThreadsAndRunnable {
  
  public static void main(String[] args) {
    Runnable obj_A = new A();
    Runnable obj_B = new B();

    Thread t1 = new Thread(obj_A);
    Thread t2 = new Thread(obj_B);

    t1.start();
    t2.start();

  }
}

class A implements Runnable{

  @Override
  public void run() {
    for(int i=0;i<5;i++){
      System.out.println("Hi A");

      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
class B implements Runnable{

  @Override
  public void run() {
    for(int i=0;i<5;i++){
      System.out.println("hi B..");

      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
}