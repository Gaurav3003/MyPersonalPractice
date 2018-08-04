package demo.designPattern.creational.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
        System.out.println("EagerInitializedSingleton initialized");
    }


    public static LazyInitializationSingleton getInstance(){
        if(null == instance){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
