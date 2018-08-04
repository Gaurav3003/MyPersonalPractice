package datastructure.demo.practice;

public class QueueMain {
    public static void main(String []args){
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(5);

        queue.deQueue();
        queue.show();



    }
}
