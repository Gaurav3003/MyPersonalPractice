package demo.practice.hackerrank;


import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public int pop() throws Exception {
        if(queue1.peek()==null){
            throw new Exception("Stack is empty");
        }else{
            return queue1.remove();
        }
    }

    public void push(int data){
        if(queue1.peek()==null){
            queue1.add(data);
        }else{
            for(int i = queue1.size();i>0;i--){
                queue2.add(queue1.remove());
            }
            queue1.add(data);
            for(int i = queue2.size();i>0;i--){
                queue1.add(queue2.remove());
            }
        }
    }

    public static void main(String[] args) throws Exception{
        StackImplUsingQueue s1 = new StackImplUsingQueue();
        //       Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.push(10);
        // s1.push(6);
        System.out.println("1st = " + s1.pop());
        System.out.println("2nd = " + s1.pop());
        System.out.println("3rd = " + s1.pop());
        System.out.println("4th = " + s1.pop());
        System.out.println("5th = " + s1.pop());
        System.out.println("6th = " + s1.pop());
        System.out.println("7th = " + s1.pop());
        System.out.println("8th = " + s1.pop());
        System.out.println("9th = " + s1.pop());
        System.out.println("10th= " + s1.pop());
    }
}
