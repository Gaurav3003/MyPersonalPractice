package demo.practice.JPMC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

/*
Write a program that, given an integer, inserts a '*' between adjacent digits that are both even and a '-' between adjacent digits that are both odd. Zero should not be considered even or odd.
Input:
Your program should read lines from standard input. Each line contains a positive integer.
Output:
For each line from standard input, print to standard output the input string with '*' and '-' properly inserted as described above, one string per line.

Input : 1234567890
Output : 1234567890

Input : 12467930
Output : 12*4*67-9-30
[1, 2, *, 4, *, 6, 7, -, 9, -, 3, 0]
Input : 124679300
Output : 12*4*67-9-300
 */
public class Addjacent {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            print(line);
        }
    }
    public static void print(String str){
        String arr[] = str.split("");
        int intArr[] = new int[str.length()];
        for(int i = 0;i<arr.length;i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        List<String> list = new LinkedList<>();
        for(int i =0;i<intArr.length-1;i++){
            list.add(String.valueOf(intArr[i]));
            if(intArr[i]==0 && intArr[i+1]==0){
                continue;
            }else if(intArr[i]%2 == 0 && intArr[i+1]%2 == 0){
                list.add("*");
            }else if(!(intArr[i]%2 == 0) && !(intArr[i+1]%2 == 0)){
                list.add("-");
            }
        }
        list.add(String.valueOf(intArr[intArr.length-1]));
        StringBuilder sb = new StringBuilder();
        for(String s :list){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
