package java8.demo.funtionalinterface;

import java.util.ArrayList;
import java.util.List;

public class FuntionalInterfaceTest {
    public static void main(String args[]){
        Calculator calc = (n1,n2) ->  n1 + n2;

        List<MyNumber> myNumberList = new ArrayList<>();
        myNumberList.add(new MyNumber(4,5));
        myNumberList.add(new MyNumber(10,20));
        myNumberList.add(new MyNumber(4,90));
        myNumberList.add(new MyNumber(40,5));

        for(MyNumber myNumber : myNumberList){
            System.out.println(myNumber.process(calc));
        }
        System.out.println("*******************************************");
        for(MyNumber myNumber : myNumberList){
            System.out.println(myNumber.process((n1,n2)->n1 * n2));
        }



        Calculator calculator = Utility::add;
        System.out.println("*******************************************");
        for(MyNumber myNumber : myNumberList){
            System.out.println(myNumber.process(calculator));
        }


        System.out.println("*******************************************");
        for(MyNumber myNumber : myNumberList){
            System.out.println(myNumber.process(Utility::multiply));
        }
    }
}
