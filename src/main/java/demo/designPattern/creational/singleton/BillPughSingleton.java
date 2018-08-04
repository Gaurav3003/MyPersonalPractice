package demo.designPattern.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){
        System.out.println("BillPughSingleton initialized");
    }

    private static class Singleton{
        private static BillPughSingleton billPughSingleton= new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Singleton.billPughSingleton;
    }

}
