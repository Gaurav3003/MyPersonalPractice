package demo.practice.boeing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
You Are given an Array A containing N elements.
Given element X.
1. Remove every occurance of X
2. Move all the remaining element to right.
3. Fill the empty spots with 1.

Input:
2 (No of test to be executed)
5 (test1 - no of elemnt in array)
22 1 34 22 16 ( array elements)
22 (number to remove)
7 (test2 - no of elemnt in array)
3 5 3 5 5 11 5( array elements)
5(number to remove)

Output:
1 1 1 34 16
1 1 1 13 3 11
 */
class InputTestData{

    int arraySize;
    int numToRemove;
    String inputArray;

    public InputTestData(int arraySize, int numToRemove, String inputArray) {
        this.arraySize = arraySize;
        this.numToRemove = numToRemove;
        this.inputArray = inputArray;
    }

    public int getArraySize() {
        return arraySize;
    }

    public int getNumToRemove() {
        return numToRemove;
    }

    public String getInputArray() {
        return inputArray;
    }
}
public class ReArrangeArray {
    public static void main(String args[]) throws Exception{
        List<InputTestData> list = new LinkedList<>();
        try(InputStreamReader reader = new java.io.InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);) {
            String line = in.readLine();

            for(int i = 0; i<Integer.parseInt(line);i++){
                String noOfInput = in.readLine();
                String inputArray = in.readLine();
                String num = in.readLine();
                InputTestData inputTestData = new InputTestData(Integer.parseInt(noOfInput),Integer.parseInt(num),inputArray);
                list.add(inputTestData);
            }
        }

        reArrangeArray(list);
    }

    private static void reArrangeArray(List<InputTestData> list) {


        if(null!=list && list.size()>0){

            Iterator<InputTestData> it = list.iterator();

            while(it.hasNext()){
                List<Integer> reArrangedList = new ArrayList<>();
                int count = 0;
                InputTestData inputTestData = it.next();
                String []arr = inputTestData.getInputArray().split(" ");
                for(int i = 0 ; i<arr.length;i++){
                    int num = Integer.parseInt(arr[i]);
                    if(num!=inputTestData.getNumToRemove()){
                        reArrangedList.add(num);
                    }else if(num==inputTestData.getNumToRemove()){
                        count++;
                    }
                }
                for(int i = 0;i<count;i++){
                    reArrangedList.add(0,1);
                }
                if(null!=reArrangedList && reArrangedList.size()>0) {
                    Iterator<Integer> iterator = reArrangedList.iterator();
                    while(iterator.hasNext()){
                        System.out.print(iterator.next()+"\t");
                    }
                }
                System.out.println();
            }

        }

    }
}
