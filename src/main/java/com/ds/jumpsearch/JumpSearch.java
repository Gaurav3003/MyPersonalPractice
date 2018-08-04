package com.ds.jumpsearch;
/*
Jump Search is a searching algorithm for sorted arrays. The basic idea is to check fewer elements (than linear search) by jumping ahead by fixed steps or skipping some elements in place of searching all elements.
In the worst case, we have to do n/m jumps and if the last checked value is greater than the element to be searched for, we perform m-1 comparisons more for linear search. Therefore the total number of comparisons in the worst case will be ((n/m) + m-1). The value of the function ((n/m) + m-1) will be minimum when m = √n. Therefore, the best step size is m = √n.
 */
public class JumpSearch {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,14,16,17,19,29,67,45,89};
        int index = getIndexJumpSearch(arr,39);
        System.out.println(index);

    }
    /*
    recursively calling the getIndex method
    Time Complexity = O(log n)
    */
    public static int getIndexJumpSearch(int[] arr,int number){
        int index = -1;
        int tempIndex= -1;
        int length = arr.length;
        int jumpStep = (int) Math.floor(Math.sqrt(length));
        for(int i = 0;i<arr.length;i=i+jumpStep){
            if(number<arr[i]){
                tempIndex = i;
                break;
            }
        }
        if(tempIndex>=0) {
            while (arr[tempIndex] != number) {
                index = --tempIndex;
            }
        }

        return index;
    }
}
