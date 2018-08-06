package demo.practice.Visa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Input will  be one string.
devide the string in two part
if(part1.length - part2.length)<=1, then check for number of element to replace to make the string anagram

input

aaabbb - > aaa bbb -> 3
aaab -> aa ab -> 1
ab -> 1
abc -> -1
mqcd -> mq cd -> 2
xyyx -> xy yx -> 0
 */
public class AnagramSolution {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line = in.readLine();
        int count = Integer.parseInt(line);
        List<String> list = new ArrayList<>();
        while (count!=0 &&(line = in.readLine()) != null) {
            list.add(line);
            count--;
        }
        anagram(list);
    }

    private static void anagram(List<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            int length = str.length();
            System.out.println(countManipulations(str.substring(0,length/2),str.substring(length/2,length)));
        }
    }

    static int countManipulations(String s1, String s2)

    {
        if(s1.length()!=s2.length()){
            return -1;
        }
        int count = 0;

        // store the count of character
        int char_count[] = new int[26];

        // iterate though the first String and update
        // count
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i) - 'a');
            char_count[s1.charAt(i) - 'a']++;
        }

        // iterate through the second string
        // update char_count.
        // if character is not found in char_count
        // then increase count
        for (int i = 0; i < s2.length(); i++)
            if (char_count[s2.charAt(i) - 'a']-- <= 0)
                count++;

        return count;
    }
}
