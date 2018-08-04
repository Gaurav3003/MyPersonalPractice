package demo.practice.Visa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
Input
3 (number of input)
1 3
3 5
4 6
1/3 + 3/5 + 4/6 = 144/90 = 8/5
out put = 8 5
 */
public class AddFractions {
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

        String str = addFractions(list);
        System.out.println(str);
    }

    private static String addFractions(List<String> list) {

        int numerator = 0;
        int denominator = 1;

        int numeratorList[] = new int[list.size()];
        int denominatorList[] = new int[list.size()];
        int counter = 0;

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String value = it.next();
            String[] values = value.split(" ");
            numeratorList[counter] = Integer.parseInt(values[0]);
            denominatorList[counter] = Integer.parseInt(values[1]);
            counter++;
        }
        for(int i = 0;i<denominatorList.length;i++){
            denominator = denominator * denominatorList[i];
        }

        for(int i = 0 ; i < numeratorList.length;i++){
            numerator = numerator + (numeratorList[i] * (denominator/denominatorList[i]));
        }

        int gcdfactor = getGCD(numerator, denominator);

        if(gcdfactor!=0){
            numerator = numerator / gcdfactor;
            denominator = denominator / gcdfactor;
        }

        return numerator+" "+denominator;
    }

    private static int findGCD(int numerator, int denominator) {
        if(numerator == 0 || denominator == 0){
            return 0;
        }
        if(numerator == denominator){
            return numerator;
        }
        if(numerator>denominator)
            return findGCD(numerator-denominator,denominator);
        else
            return findGCD(numerator,denominator-numerator);
    }

    private static int getGCD(int numerator, int denominator) {
        int min = Math.min(numerator,denominator);
        int max = Math.max(numerator,denominator);
        int gcd = min;

        while(max%min !=0){
            gcd = max%min;
            max = min;
            min = gcd;
        }
        return gcd;
    }




}
