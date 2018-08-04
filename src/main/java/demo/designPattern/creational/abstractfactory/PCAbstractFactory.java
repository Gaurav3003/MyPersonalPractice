package demo.designPattern.creational.abstractfactory;

public class PCAbstractFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCAbstractFactory(String ram, String hdd, String cpu){
        System.out.println("Instatiating PCAbstractFactory object");
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
