package datastructure.demo.practice;

public class StackMain {
    public static void main(String args[])throws Exception{

        //Stack using array
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        //stack using linked list
        DynamicStack dynamicStack = new DynamicStack();
        dynamicStack.push(10);
        dynamicStack.push(30);
        dynamicStack.push(40);
        dynamicStack.push(50);

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());


        System.out.println(dynamicStack.peek());


    }
}
