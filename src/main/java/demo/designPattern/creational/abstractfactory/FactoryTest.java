package demo.designPattern.creational.abstractfactory;

public class FactoryTest {
    public static void main(String args[]){
        Computer computer = ComputerFactory.getComputer(new PCAbstractFactory("4GB","500GB","Core2Duo"));
        System.out.println(computer);
    }
}
