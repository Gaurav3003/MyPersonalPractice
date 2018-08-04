package com.ds.binarysearch;

public class BinarySearch {

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
        int index=getIndexRecursively(arr,0,arr.length-1,2);
        System.out.println(index);

        index=getIndexIteratively(arr,0,arr.length-1,4);
        System.out.println(index);
    }
    /*
    recursively calling the getIndex method
    Time Complexity = O(log n)
    */
    public static int getIndexRecursively(int[] arr,int firstIndex, int lastIndex, int number){
        int index = -1;
        if(lastIndex>=firstIndex) {
            int midIndex = firstIndex + (lastIndex - firstIndex) / 2;

            if(arr[midIndex]==number){
                return midIndex;
            }else if(number>arr[midIndex]){
                return getIndexRecursively(arr,midIndex+1,lastIndex,number);
            }else{
                return getIndexRecursively(arr,firstIndex,midIndex-1,number);
            }
        }
        return index;
    }
    /*
   iteratively calling the getIndex method
   Time Complexity = O(n)
   */
    public static int getIndexIteratively(int[] arr,int firstIndex, int lastIndex, int number){
        int index = -1;
        while(lastIndex>=firstIndex){
            int midIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if(arr[midIndex]==number){
                return midIndex;
            }else if(number>arr[midIndex]){
                firstIndex = midIndex+1;
            }else{
               lastIndex = midIndex-1;
            }
        }
        return index;
    }
}
