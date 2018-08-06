package demo.practice.soceite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 class Solution {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line = in.readLine();
        int count = Integer.parseInt(line);
        if(count>5000 || count <0){
            return;
        }
        List<String> list = new ArrayList<>();
        while (count!=0 &&(line = in.readLine()) != null) {
            list.add(line);
            count--;
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            split(it.next());
        }


    }

    public static void split(String str)
    {
        int len = str.length();
        if (len == 1) {
            System.out.println("Not Possible");
            return;
        }
        String s1 = "", s2 = "";
        long num1, num2;

        for (int i = 0; i <= len / 2; i++) {
            int flag = 0;
            s1 = str.substring(0, i + 1);
            num1 = Long.parseLong((s1));
            num2 = num1 + 1;
            s2 = Long.toString(num2);
            int k = i + 1;
            while (flag == 0) {
                int l = s2.length();
                if (k + l > len) {
                    flag = 1;
                    break;
                }
                if ((str.substring(k, k + l).equals(s2))) {
                    flag = 0;
                    num2++;
                    k = k + l;
                    if (k == len)
                        break;
                    s2 = Long.toString(num2);
                    l = s2.length();
                    if (k + 1 > len) {
                        flag = 1;
                        break;
                    }
                }

                else
                    flag = 1;
            }
            if (flag == 0) {
                System.out.println("Possible"
                        + " " + s1);
                break;
            }
            else if (flag == 1 && i > len / 2 - 1) {
                System.out.println("Not Possible");
                break;
            }
        }
    }
}
