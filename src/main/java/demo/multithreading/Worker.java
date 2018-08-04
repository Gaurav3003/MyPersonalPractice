package demo.multithreading;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void stageOne() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    public void stageTwo(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    public void process(){
        for(int i = 0; i<1000;i++){
            stageOne();
            stageTwo();
        }
    }

    public static void main(String args[]){
        Runtime.getRuntime();
        
        System.out.println("Starting..................");
        long startTime = System.currentTimeMillis();

        //this.process();

        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken:"+ (endTime-startTime));
        //System.out.println("List1 : "+this.list1);
    }

}
