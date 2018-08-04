package demo.designPattern.creational.abstractfactory;

public class ServerAbstractFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerAbstractFactory(String ram, String hdd, String cpu){
        System.out.println("Instatiating ServerAbstractFactory object");
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
