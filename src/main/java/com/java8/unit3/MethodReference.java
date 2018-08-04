package com.java8.unit3;

public class MethodReference {

    public static void main(String[] args){
        Thread t = new Thread(MethodReference::printMessage); //MethodReference::printMessage === ()->printMessage()
        //here lambda expression doing the method execution
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
