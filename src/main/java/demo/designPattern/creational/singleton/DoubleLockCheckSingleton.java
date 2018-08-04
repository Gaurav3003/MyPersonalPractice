package demo.designPattern.creational.singleton;

public class DoubleLockCheckSingleton {

    private static DoubleLockCheckSingleton instance;

    private DoubleLockCheckSingleton() {
        System.out.println("DoubleLockCheckSingleton initialized");
    }


    public static DoubleLockCheckSingleton getInstance(){
        if(null == instance){
            System.out.println("Staring first check");
            synchronized (DoubleLockCheckSingleton.class){
                System.out.println("Staring 2nd check");
                if(null == instance)
                    instance = new DoubleLockCheckSingleton();
            }
        }
        return instance;
    }
}
