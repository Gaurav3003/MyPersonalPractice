package demo.multithreading;

import java.util.Scanner;

class Processor extends Thread{
    private  boolean running = true;

    public void shutDown(){
        this.running = false;
    }
    @Override
    public void run(){
        while(running){
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


public class App {

    public static void main(String args[]){
        Processor processor1 = new Processor();
        processor1.start();


        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        processor1.shutDown();
    }
}
