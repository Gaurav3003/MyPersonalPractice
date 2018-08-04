package demo.designPattern.creational.factory;

public class ComputerFactory {

    public static Computer getComputer(String ram, String hdd, String cpu, String type){
        if(null!=type) {
            switch (type.toUpperCase()) {
                case "PC":
                    return new PC(ram, hdd, cpu);
                case "SERVER":
                    return new Server(ram, hdd, cpu);
            }
        }
        return null;
    }
}
