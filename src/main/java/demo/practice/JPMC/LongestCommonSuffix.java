package demo.practice.JPMC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Stack;
/*
    Take input from user two strings with comma separated.
    print the longest suffix for both the strings if present, else print NULL.
    eg
    Input : cornfield, outfield
    Output: field

    Input : hello, monkey
    output: NULL
 */

public class LongestCommonSuffix {
    public static void longestSuffix(){
        String i1="cornfield";
        String i2="outfield";

        Stack<Character> stack1= new Stack<>();
        for (int i =0;i<i1.toCharArray().length;i++){
            stack1.push(i1.charAt(i));

        }
        System.out.println(stack1.elements());
    }

    public static void main(String args[]) throws Exception{
        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();*/

        LongestCommonSuffix.longestSuffix();

//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line = in.readLine();
//
//        while (line != null) {
//            System.out.println(findLongestSuffix(line));
//            line = in.readLine();
//        }


    }

    private static String findLongestSuffix(String str) {
        String strArray[]=str.split(",");
        if(null == strArray[0] || strArray[0].isEmpty() || null == strArray[1] || strArray[1].isEmpty()){
            return "NULL";
        }
        strArray[0] = strArray[0].trim();
        strArray[1] = strArray[1].trim();
        int size = 0;
        if(strArray[0].length()>strArray[1].length()){
            size = strArray[1].length();
        }else if(strArray[1].length()>strArray[0].length()){
            size = strArray[0].length();
        }else{
            size = strArray[0].length();
        }
        StringBuilder sb1 = new StringBuilder(strArray[0]);
        StringBuilder sb2 = new StringBuilder(strArray[1]);
        StringBuilder sb = new StringBuilder();
        sb1 = sb1.reverse();
        sb2 = sb2.reverse();
        for(int i = 0;i<size;i++){
            if(sb1.charAt(i)==sb2.charAt(i)){
                sb.append(sb1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.reverse().toString();

    }


}
