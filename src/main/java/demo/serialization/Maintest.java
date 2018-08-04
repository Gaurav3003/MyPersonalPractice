package demo.serialization;

import java.io.*;

public class Maintest {
    public static void main(String args[]){
        Address address = new Address("BLR","KA");

        Employee employee = new Employee(1001,"Kevin");
        employee.setAddress(address);
        System.out.print(employee);
        String filename = "employee.ser";
        serialize(employee,filename);
        Employee emp = deserialize(filename);
        System.out.print(emp);

    }
    public static void serialize(Object obj,String filename){
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Employee deserialize(String filename){
        try {
            FileInputStream fos = new FileInputStream(filename);
            ObjectInputStream oos = new ObjectInputStream(fos);
            Employee emp = (Employee) oos.readObject();
            fos.close();
            return emp;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
