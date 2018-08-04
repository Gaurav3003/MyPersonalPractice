package com.bt.exercise;

public class ClosureExample {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i+b);
            }
        });

        doProcess(a,i -> System.out.println(i+b));
    }

    private static void doProcess(int i,Process p){
        p.process(i);
    }

}
interface  Process{
    void process(int i);
}
