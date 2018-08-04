package demo.multithreading;
class Counter{
    int counter;

    public synchronized void increament(){
        counter++;
    }
}
public class SynchronizationDemo {

    public static void main(String args[]) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
           for(int i = 1; i<=1000;i++) {
               counter.increament();
           }
        });

        Thread t2 = new Thread(()->{
            for(int i = 1; i<=1000;i++) {
                counter.increament();
            }
        });

        t1.start();
        t2.start();

        t2.join();
        t1.join();

        System.out.println(counter.counter);

    }
}
