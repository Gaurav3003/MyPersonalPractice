package com.oops.concept;

public class Child extends Parent {
    public void show(int i,int j){
        System.out.println("Child : int "+i);
    }
    public void show(Integer i,Integer j){
        System.out.println("Child : Integer "+i);
    }
    public void show(long i,long j){
        System.out.println("Child : long "+i);
    }
    public void display(){
        System.out.println("Child : individual method ");
    }

}
