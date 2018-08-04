package demo.practice.goldmansach;

import java.util.Scanner;
import java.util.Stack;

/*
Given a Pattern containing only Ns and Ms, N represents ascending and M represents descending, Each character (M or N) needs to display sequence of numbers (2 numbers ) explaining teh ascending or descending order
eg 21 -> represents descending -> M, The second character in the pattern takes last digit from first chanrachet and build the sequence and so on.

 constraints:-
 1. input can have maximum 8 chars
 2. output can have digits from 1-9 and can't repeat
 3. in  case no possible out or incorrect input value (blank/null/NON), return -1;

 Input :
 M
 Output : 21

 input :
 MNM

 output:
 2143

 */
public class PrintSmallesNumberFromPattern {

    /*public static void main(String args[]){
        String num = printSmallest("MNM");
        System.out.println(num);
    }

    private static String printSmallest(String pattern) {

        char[] charArray = pattern.toCharArray();

        int start = 0;
        String number = null;

        boolean foundN = false;
        boolean foundM = false;
        int beginN = -1;
        int beginM = 0;
        int endM = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (c == 'N') {

                if (foundM) {
                    int currentCursor = start;

                    if (beginN >= 0) {
                        if (number == null) {
                            number = "" + ++currentCursor;
                        }

                        for (int x = beginN; x < beginM - 1; x++) {
                            number += ++currentCursor;
                        }

                        currentCursor = currentCursor + (endM - beginM + 1) + 1;
                        number += currentCursor;
                    }

                    if (number == null) {
                        currentCursor = ++currentCursor + (endM - beginM) + 1;
                        number = "" + currentCursor;
                    }

                    start = currentCursor;

                    for (int x = beginM; x <= endM; x++) {
                        number += --currentCursor;
                    }

                    foundM = false;
                    foundN = false;
                }

                if (!foundN) {
                    foundN = true;
                    beginN = i;
                }
            }

            if (c == 'M') {
                if (!foundM) {
                    foundM = true;
                    beginM = i;
                    endM = i;
                } else {
                    endM = i;
                }
            }
        }

        if (start <= charArray.length) {

            if (foundN && foundM) {
                int currentCursor = start;

                if (beginN >= 0) {
                    if (number == null) {
                        number = "" + ++currentCursor;
                    }

                    for (int x = beginN; x < beginM - 1; x++) {
                        number += ++currentCursor;
                    }

                    currentCursor = currentCursor + (endM - beginM + 1) + 1;
                    number += currentCursor;
                }

                if (number == null) {
                    currentCursor = ++currentCursor + (endM - beginM) + 1;
                    number = "" + currentCursor;
                }

                start = currentCursor;

                for (int x = beginM; x <= endM; x++) {
                    number += --currentCursor;
                }
            } else if (foundN) {
                if (number == null) {
                    number = "";
                }
                for (int j = start + 1; j <= charArray.length + 1; j++) {
                    number += j;
                }
            } else if (foundM) {
                if (number == null) {
                    number = "";
                }
                for (int j = charArray.length + 1; j >= start + 1; j--) {
                    number += j;
                }
            }
        }
        return number;
    }*/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String seq = sc.nextLine();
        //System.out.println("T = "+T);
        for(int i = 0; i < T; i++){
            seq = sc.nextLine();
            //System.out.println("Seq = " + seq);
            printNumber(seq);
        }
        //code
    }

    public static void printNumber(String s){
        String ans = "";
        int len = s.length();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= len; i++){
            stack.push(i+1);
            if(i == len || s.charAt(i) == 'I' ){
                while(!stack.empty()){
                    int a = stack.pop();
                    ans += a;
                }

            }
        }
        System.out.println(ans);
    }
}
