package demo.practice.hackerrank;

import java.util.Scanner;

/*
Given a base-10 integer n , convert it to binary (base-2). Then find and print the base- integer denoting the maximum number of consecutive 1's in n's binary representation.
Sample Case 1:
The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2:
The binary representation of  13 is 1101, so the maximum number of consecutive 1's is 2.
 */
public class DecimalToBinary {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int count=0;
        int max=0;
        int num = sc.nextInt();
        while(num!=0){
            int x = num%2;
            if(x==1){
                count++;
                if(count>max)
                    max = count;
            }else{
                count=0;
            }
            str.append(x);
            num=num/2;
        }
        System.out.println(str.reverse()+" : "+max);
    }
}
