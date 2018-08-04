package demo.designPattern.creational.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println("EagerInitializedSingleton initialized");
    }


    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
