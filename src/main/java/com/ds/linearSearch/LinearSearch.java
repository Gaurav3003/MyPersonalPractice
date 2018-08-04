package com.ds.linearSearch;
/*
Given an array arr[] of n elements, write a function to search a given element x in arr[].

Examples :

Input : arr[] = {10, 20, 80, 30, 60, 50,
                     110, 100, 130, 170}
          x = 110;
Output : 6
Element x is present at index 6

Input : arr[] = {10, 20, 80, 30, 60, 50,
                     110, 100, 130, 170}
           x = 175;
Output : -1
Element x is not present in arr[].
 */
public class LinearSearch {
    public static void main(String args[]){
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        //System.out.println(getIndex(arr,111));

        System.out.println(getIndexRecursively(arr,0,100));

    }
    /*
        The time complexity of above algorithm is O(n).
    */
    public static int getIndex(int arr[], int number){
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static int getIndexRecursively(int arr[],int currentIndex, int number){
        int length = arr.length;
        if (currentIndex > length){
            return -1;
        }else if (arr[currentIndex] == number){
            return currentIndex;
        }else{
            return getIndexRecursively(arr,currentIndex+1,number);
        }
    }
}

