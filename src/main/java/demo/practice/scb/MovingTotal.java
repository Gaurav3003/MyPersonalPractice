package demo.practice.scb;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
/*
Given an arr = {1,2,3} - sum of elements - 1+2+3 = 6 , Hence append method will calculate the sum and add to list
if append({4}), called it should store in the list the new sum 2+3+4 = 9
Hence list will have now 6 and 9.

Call a contains method passing an int value, check if that value matches to the sum of the values in array

constraint:- the number should be consecutive
 */
public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */

    List<Integer> sumList = new ArrayList<>();
    List<Integer> arr = new ArrayList<>();
    int counter = 0;
    int finalSum = 0;

    public void append(int[] list) {
        int sum = 0;
        int count = counter;
        if(!arr.isEmpty() ){
            int num = arr.get(arr.size()-1)+1;
            int val = list[0];
            if(num!=val)
                return;
        }
        for(int i = 0;i<list.length;i++ ){
            arr.add(list[i]);
        }
        for(;count<arr.size();count++){
            sum = sum + arr.get(count);
        }
        finalSum = sum;
        sumList.add(finalSum);
        counter++;


    }
    Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
    public void appendQueue(int []list){

        int value = 0;
        if(!queue.isEmpty()){
            value = queue.poll();
            queue.offer(list[0]);
            finalSum = finalSum + list[0] - value;
        }else{
            for(int i = 0;i<list.length;i++){
                queue.offer(list[i]);
                finalSum = finalSum + list[i];
            }
        }
        sumList.add(finalSum);
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
        return sumList.contains(total);
    }


    static int size = 7;

    static void changeSize(int size){
        size = size + 1;

    }

    public static void main(String[] args) {
        /*Runtime.getRuntime();

        System.out.println("Starting..................");
        long startTime = System.currentTimeMillis();
        MovingTotal movingTotal = new MovingTotal();
        int arr[] = new int[3];

        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }

        movingTotal.append(arr);

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));



        for(int i = 0; i<100;i++){
            movingTotal.append(new int[] { i+4 });
        }
        System.out.println(movingTotal.contains(9));


        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken:"+ (endTime-startTime));*/

        /*Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());;
        System.out.println(stack.search(5));*/

        System.out.println((Integer.MAX_VALUE+1)==Integer.MIN_VALUE);

        /*try{
            int i =0;
        }catch (Error e){

        }
*/
    }
}

class A{
    static int i =1111;
    static{
        i = i-- - --i;
    }
    {
        i = i++ + ++i;
    }
}

class B extends A{
    static{
        i = --i - i--;
    }
    {
        i = ++i + i++;
    }
}