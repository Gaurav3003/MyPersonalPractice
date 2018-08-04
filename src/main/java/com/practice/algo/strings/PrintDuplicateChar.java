package com.practice.algo.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateChar {
    public static void main(String args[]){
        String str = "aaaaa";
        printDuplicate(str);

    }

    private static void printDuplicateSet(String str){
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        char[] dupicateChars = new char[chars.length];
        for(int i = 0;i < chars.length; i++){
            if(!set.add(chars[i])){
                dupicateChars[i] = chars[i];
            }
        }
        System.out.println(dupicateChars);
    }

    private static void printDuplicateMap(String str){
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character ch:chars){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entry=map.entrySet();
        for (Map.Entry<Character,Integer> e:
             entry) {
            if(e.getValue()>1){
                System.out.println(e.getKey()+" : "+e.getValue());
            }
        }
    }

    private static void printDuplicate(String str){
        int count[] = new int[256];
        for(int i = 0;i < str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i = 0;i<256;i++){
            if(count[i]>1){
                System.out.printf("%c,  count = %d \n", i,  count[i]);
            }
        }
    }
}
