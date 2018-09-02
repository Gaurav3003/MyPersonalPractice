package demo.practice.hackerrank;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.
Input:
2
hello
world
hi
world

Output:
YES
NO
 */
public class CommonLettersInString {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        if(null==s1 || s1.isEmpty() || null==s2 || s2.isEmpty()){
            return "NO";
        }
        char charArray1[]=s1.toCharArray();
        char charArray2[]=s2.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0;i<charArray1.length;i++){
            set.add(charArray1[i]);
        }
        System.out.println(set);
        for(int i = 0;i<charArray2.length;i++){
            if(set.contains(charArray2[i]))
                return "YES";
        }
        return "NO";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

        /*for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }*/

        String result = twoStrings("hi", "world");
        System.out.println(result);



        scanner.close();
    }
}
