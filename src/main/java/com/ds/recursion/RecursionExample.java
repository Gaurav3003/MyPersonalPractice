package com.ds.recursion;

public class RecursionExample {


    public static void main(String arg[]){
        reduceByOne(10);
    }
    public static void reduceByOne(int n){
        if(n >= 0) {

            reduceByOne(n - 1);
        }
        System.out.println("Completed the call "+n);
    }
}
