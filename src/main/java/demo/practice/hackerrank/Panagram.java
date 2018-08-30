package demo.practice.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*
Roy wanted to increase his typing speed for programming contests. His friend suggested that he type the sentence "The quick brown fox jumps over the lazy dog" repeatedly. This sentence is known as a pangram because it contains every letter of the alphabet.

After typing the sentence several times, Roy became bored with it so he started to look for other pangrams.

Given a sentence, determine whether it is a pangram. Ignore case.

Function Description

Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

pangrams has the following parameter(s):

s: a string to test

Sample Input 0

We promptly judged antique ivory buckles for the next prize

Sample Output 0

pangram

Sample Explanation 0

All of the letters of the alphabet are present in the string.

Sample Input 1

We promptly judged antique ivory buckles for the prize

Sample Output 1

not pangram

Sample Explanation 0

The string lacks an x.
 */
public class Panagram {
    public static void main(String args[]) throws Exception{
        String input = null;
        try(InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);) {
            input = in.readLine();
        }
        if(input!=null && !input.isEmpty()){
            int[] alphabets = new int[26];
            input = input.toLowerCase().replace(" ","");

            for (int i = 0; i < input.length(); i++) {
                alphabets[input.charAt(i) - 'a']++;
            }
            boolean flag = true;
            for(int i = 0;i<alphabets.length;i++){
                if(alphabets[i]==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("pangram");
            }else{
                System.out.println("not pangram");
            }
        }
    }
}
