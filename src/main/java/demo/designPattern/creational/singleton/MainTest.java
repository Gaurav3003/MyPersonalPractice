package demo.designPattern.creational.singleton;

class ThreadDemo extends Thread{
    @Override
    public void run(){
        DoubleLockCheckSingleton e1=DoubleLockCheckSingleton.getInstance();
        System.out.println(e1.hashCode());
    }
}


public class MainTest {

    public static void main(String args[]){
        /*EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton1.hashCode()+"   ::    "+eagerInitializedSingleton2.hashCode());*/

        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        System.out.println("Starting..................");
        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken:"+ (endTime-startTime));
    }
}
