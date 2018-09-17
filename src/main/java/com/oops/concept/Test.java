package com.oops.concept;

import java.awt.*;
import java.util.*;

public class Test {
    public static void main(String args[]){
       HashMap<String,Integer> map  =new HashMap<>();
       map.put("jda",1);
       map.put("ban",1);
       System.out.println(map);
       map.clear();
    }
}

class Item implements Comparable{
    int price;
    int id;
    @Override
    public int compareTo(Object o) {
        if(o instanceof Item){
            return this.price - ((Item) o).price;
        }
        return 0;
    }
}
