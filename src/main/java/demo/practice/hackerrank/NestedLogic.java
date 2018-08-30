package demo.practice.hackerrank;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
/*
31 12 2009
1 1 2010
0

23 12 1234
19 9 2468
0
 */
public class NestedLogic {
    public static void main(String args[]) throws Exception {
        String firstLine = null;
        String secondLine = null;
        try(InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);){
            firstLine = in.readLine();
            secondLine = in.readLine();
        }
        if(null!=firstLine && !firstLine.isEmpty() && null!=secondLine && !secondLine.isEmpty())
            System.out.println(calaculatePenalty(firstLine,secondLine));
    }

    private static int calaculatePenalty(String firstLine, String secondLine) throws Exception{
        int fine = 0;
        int dueDay = 0;
        int dueMonth = 0;
        int dueYear = 0;

        int returnDay = 0;
        int returnMonth = 0;
        int returnYear = 0;

        String arr1[] = firstLine.split(" ");
        String arr2[] = secondLine.split(" ");

        if(arr1.length!=3 && arr2.length!=3){
            throw new Exception("Invalid Input");
        }

        returnDay = Integer.parseInt(arr1[0]);
        returnMonth = Integer.parseInt(arr1[1]);
        returnYear = Integer.parseInt(arr1[2]);

        dueDay = Integer.parseInt(arr2[0]);
        dueMonth = Integer.parseInt(arr2[1]);
        dueYear = Integer.parseInt(arr2[2]);

        if(returnYear>dueYear){
            fine = 10000;
            return fine;
        }
        if(returnYear==dueYear && returnMonth>dueMonth){
            int diff = returnMonth - dueMonth;
            fine = 500 * diff;
            return fine;
        }
        if(returnMonth==dueMonth && returnDay>dueDay){
            int diff = returnDay - dueDay;
            fine = 15 * diff;
            return fine;
        }
        return fine;
    }
}
