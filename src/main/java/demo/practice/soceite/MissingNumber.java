package demo.practice.soceite;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/*
Missing Numbers
Missing Numbers

Alex, the Artist, had two lists A and B, such that B was a permutation of A. Alex was very proud of these lists. Unfortunately, while transporting them from one exhibition to another, some numbers were left out of A. Can you find the missing numbers?
Notes
•    If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
•    You have to print all the missing numbers in ascending order.
•    Print each missing number once, even if it is missing multiple times.
•    The difference between the maximum and minimum number in B is less than or equal to 100.

Input Format

There will be four lines of input:
n - the size of the first list
This is followed by space-separated integers that make up the first list.
m - the size of the second list
This is followed by space-separated integers that make up the second list.

Output Format
Output the missing numbers in ascending order.

Sample Input
1
10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
Sample Output
204 205 206
Constraints
1 <= n, m <= 1000010

1 <= x <= 10000, x belongs to B

Xmax – Xmin < 101

Explanation
204 is present in both arrays. Its frequency in A is 2, while its frequency in B is 3. Similarly, 205 and 206 occur twice in A, but thrice in B. So, these three numbers are our output. The rest of the numbers have the same frequency in both lists.
 */
public class MissingNumber {
    public static void main(String[] args) throws NumberFormatException, IOException, IOException {
        Runtime.getRuntime();
        long startTime = System.currentTimeMillis();
        try(InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);) {

            List<InputObject> inputObjectList = new ArrayList<>();
            String line = in.readLine();
            int count = Integer.parseInt(line.trim());
            while (count != 0) {
                int firstListLength = Integer.parseInt(in.readLine().trim());
                String firstList = in.readLine().trim();
                int secondListLength = Integer.parseInt(in.readLine().trim());
                String secondList = in.readLine().trim();
                InputObject inputObject = new InputObject(firstListLength,secondListLength,firstList,secondList);
                inputObjectList.add(inputObject);
                count--;
            }
            readInputAndProcess(inputObjectList);

        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken:"+ (endTime-startTime));
    }

    private static int findDiffOfMinMaxInSecondList(String secondList) {
        String strArr[] = secondList.split(" ");
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<strArr.length;i++){
            set.add(Integer.parseInt(strArr[i]));
        }
        int min = Collections.min(set);
        int max = Collections.max(set);
        return max - min;
    }


    private static void readInputAndProcess(List<InputObject> inputObjects){
        Iterator<InputObject> it = inputObjects.iterator();
        while(it.hasNext()){
            InputObject input = it.next();
            printMissing(input.getFirstListLength(),input.getFirstList(),input.getSecondListLength(),input.getSecondList());
            System.out.println();
        }
    }
    private static void printMissing(int firstListLength,String firstList,int secondListLength,String secondList){
        if(firstListLength<1 || firstListLength > 1000010 || secondListLength<1 || secondListLength > 1000010){
            return;
        }
        int diff = findDiffOfMinMaxInSecondList(secondList);
        if(diff>100){
            return;
        }
        StringTokenizer st;
        int arr1[]=new int[1000010];
        int arr2[]=new int[1000010];
        st = new StringTokenizer(firstList);

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr1[num]++;
        }

        st = new StringTokenizer(secondList);

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr2[num]++;
        }
        st = null;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.print(i+" ");
            }
        }

    }
}
class InputObject{
    private int firstListLength;
    private int secondListLength;
    private String firstList;
    private String secondList;

    public InputObject(int firstListLength, int secondListLength, String firstList, String secondList) {
        this.firstListLength = firstListLength;
        this.secondListLength = secondListLength;
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public int getFirstListLength() {
        return firstListLength;
    }

    public int getSecondListLength() {
        return secondListLength;
    }

    public String getFirstList() {
        return firstList;
    }

    public String getSecondList() {
        return secondList;
    }
}
