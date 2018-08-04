package demo.designPattern.creational.singleton;

public class SyncronizedSingleton {
    private static SyncronizedSingleton instance;

    private SyncronizedSingleton() {
        System.out.println("SyncronizedSingleton initialized");
    }


    public static synchronized SyncronizedSingleton getInstance(){
        if(null == instance){
            instance = new SyncronizedSingleton();
        }
        return instance;
    }
}
