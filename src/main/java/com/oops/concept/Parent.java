package com.oops.concept;

public class Parent {

    public void show(int i,int j){
        System.out.println("Parent : int "+i);
    }
   public void show(Integer i,Integer j){
        System.out.println("Parent : Integer "+i);
    }
    public void show(long i,long j){
        System.out.println("Parent : long "+i);
    }
    public void print(){
        System.out.println("Parent : individual method ");
    }
    public Parent getParentDetails(){
        System.out.println("Parent get details");
        return new Parent();
    }
}
