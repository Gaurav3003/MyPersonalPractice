package datastructure.demo.practice;

import java.util.Arrays;

public class Stack {
    int[] array = new int[5];
    int top = -1;

    public void push(int data)throws Exception{
        if(top<array.length) {
            top++;
            array[top] = data;
        }else{
            throw new Exception("Stack is full");
        }
    }

    public int pop() throws Exception{
        if(top>=0) {
            int data = array[top];
            array[top] = 0;
            top--;
            return data;
        }else{
            throw new Exception("Stack is empty");
        }

    }

    public int peek() throws Exception{
        if(top>=0) {
            return array[top];
        }else{
            throw new Exception("Stack is empty");
        }

    }

    @Override
    public String toString() {
        return "Stack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
