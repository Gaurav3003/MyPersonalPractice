package demo.designPattern.creational.factory;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String args[]){
        Computer computer = ComputerFactory.getComputer("4GB","500GB","Core2Duo","pc");
        System.out.println(computer);
    }
}
