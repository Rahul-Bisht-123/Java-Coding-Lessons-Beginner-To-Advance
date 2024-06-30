package advance_java;

/*
---------------
Race Condition
---------------
 
- A race condition in Java (and in general computer science) occurs when two or more threads can access shared data and they try to change it at the same time. 

- Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. 

- This can lead to inconsistent or incorrect outcomes, as the operations might interfere with each other.

public class RaceCondition {
  public static void main(String[] args) {
    Counter c = new Counter();
    
    Runnable r1 = () -> {for(int i=0;i<1000;i++){c.increment();}};
    Runnable r2 = () -> {for(int i=0;i<1000;i++){c.increment();}};
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
    System.out.println(c.getCount());
  }
}
class Counter {
  private int count;
  public void increment(){count++;}
  public int getCount(){return count;}
}

In this above example, you might expect the final count to be 2000, but it often isn't. This is because the increment method is not atomic; it's actually three operations:
  1.Read the value of count.
  2.Add one to it.
  3.Write the new value back to count.

If two threads execute increment simultaneously, they might read the same value of count before either of them writes it back, resulting in one increment being lost.

------------
Solution :
------------
To prevent race conditions, you can synchronize access to the shared resource. Java provides several mechanisms for this:

Synchronized Methods:
You can declare methods as synchronized to ensure that only one thread can execute them at a time on the same object.
 */

public class RaceCondition {
  public static void main(String[] args) {
    Counter c = new Counter();
    
    Runnable r = () -> {
      for(int i=0;i<1000;i++){
        c.increment();
      }
    };

    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);

    t1.start();
    t2.start();

    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(c.getCount());
  }
}

class Counter {
  private int count;

  public synchronized void increment(){
    count++;
  }

  public synchronized int getCount(){
    return count;
  }
}