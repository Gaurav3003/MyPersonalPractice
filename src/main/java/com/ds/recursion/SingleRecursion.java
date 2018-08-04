package com.ds.recursion;

import java.util.Scanner;

public class SingleRecursion {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial of what number do you want to calculate? ");
        int number = sc.nextInt();
        System.out.println("Factorial of "+number+" is : "+factorial(number));
    }

    public static long factorial(int n) throws Exception{
        if (n<0) {
            throw new Exception("Can't calculate factorial of negative number");
        }else{
            return (n<2) ? 1: n*factorial(n-1);
        }

    }
}
