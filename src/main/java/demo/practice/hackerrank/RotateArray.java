package demo.practice.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RotateArray {
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,};
        int noOfRotation = 4;
        arr = rotateArrayByLeft(arr,noOfRotation);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static int[] rotateArrayByLeft(int arr[], int noOfRitation){
        for(int i = 0;i<noOfRitation;i++){
            arr = rotateArrayByLeftOneStep(arr);
        }
        return arr;
    }
    private static int[] rotateArrayByLeftOneStep(int[] arr) {
        int temp = arr[0];
        for(int j = 0;j<arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = temp;

        return arr;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void getInput(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotateArrayByLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
