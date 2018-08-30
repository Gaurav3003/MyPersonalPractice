package com.db.utils;

public class PrimeNumber {

    public static void main(String args[]){
        int number = 5;
        for(int i = 0;i<=number/2;i++){
            if(number%i==0){
                System.out.println("Not Prime.");
                break;
            }
        }

    }
}
