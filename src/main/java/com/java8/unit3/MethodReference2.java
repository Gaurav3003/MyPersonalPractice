package com.java8.unit3;

public class MethodReference2 {

    public static void main(String[] args){
        Thread t = new Thread(MethodReference2::printMessage); //MethodReference::printMessage === ()->printMessage()
        //here lambda expression doing the method execution
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
