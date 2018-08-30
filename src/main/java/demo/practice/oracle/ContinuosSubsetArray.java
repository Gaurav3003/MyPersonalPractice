package demo.practice.oracle;

import java.util.Arrays;
import java.util.Collections;

/*
Given two array, find whether 2 nd array is continuos subset of first array

arr1[]={1,2,3,4,5,6} arr2[]={2,3,4} - true
arr1[]={1,2,3,4,5,6} arr2[]={2,3,5} - false
arr1[]={1,2,3,4,5,6,4,5,6,7} arr2[]={4,5,6,7} - true
 */
public class ContinuosSubsetArray {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,4};
        boolean flag = true;
        int x = 0;
        int secondLength = arr2.length;
        if(secondLength<=arr1.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==arr2[0]){
                    x = i;
                    for(int j = 0;j<secondLength;j++,x++){
                        if(arr1[x]!=arr2[j]){
                            flag = false;
                            break;
                        }else{
                            flag = true;
                        }
                    }
                }
            }
        }
        System.out.println(flag);

    }
}
