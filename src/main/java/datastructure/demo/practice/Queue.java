package datastructure.demo.practice;

public class Queue {

    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        queue[rear] = data;
        if(rear==0){
            queue[front]=data;
        }
        rear++;
        size++;
    }

    public void show(){
        System.out.println(size);
        for(int i = 0;i<queue.length;i++){
            System.out.println(queue[i]);
        }
    }

    public int deQueue(){
        int data = queue[front];
        if(front<rear){
            front++;
        }
        size--;
        return data;
    }

}
