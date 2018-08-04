package demo.practice;

import java.util.*;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        System.out.print(map);
        List<String> list = new LinkedList<>();
        while(in.hasNext()){
            String s = in.next();
            System.out.print(s);
            if(map.containsKey(s)){
                list.add(s+"="+map.get(s));
            }else{
                list.add("Not found");
            }
        }
        in.close();
        for(String str:list){
            System.out.println(str);
        }
    }
}
