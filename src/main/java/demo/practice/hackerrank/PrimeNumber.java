package demo.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class PrimeNumber {

    public static void main(String args[]) throws IOException {
        try(InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);) {

            int noOfInput = Integer.parseInt(in.readLine().trim());
            int[] input = new int[noOfInput];
            for(int i =0 ; i<noOfInput;i++){
                input[i] = Integer.parseInt(in.readLine().trim());
            }

            for (int i = 0;i<input.length;i++){
                if(isPrime(input[i]))
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
            }
        }

    }

    private static boolean isPrime(int num) {
        if(num==1){
            return false;
        }
        int count = (int)Math.sqrt(num);
        for(int i = 2;i<=count;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
