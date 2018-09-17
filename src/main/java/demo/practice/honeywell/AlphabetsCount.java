package demo.practice.honeywell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class AlphabetsCount {
    public static void main(String args[]) throws Exception{
        String word = "hello";
        /*try(InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);) {
            word = in.readLine();
        }*/

        printCount(word);
    }

    private static void printCount(String word) {
        if(null!=word && !word.isEmpty()){
            int[] alphabets = new int[26];
            word = word.toLowerCase().replace(" ","");
            for (int i = 0; i < word.length(); i++) {
                alphabets[word.charAt(i) - 'a']++;
            }

            for(int i = 0;i<alphabets.length;i++){
                System.out.println((char)(i+'a')+"\t"+alphabets[i]);
            }

        }
    }
}
