package demo.practice.hackerrank;

import java.util.*;

/*

4
aba
baba
aba
xzxb
3
aba
xzxb
ab
 */
public class SparseArray {
    static int[] matchingStrings(String[] strings, String[] queries) {

        Map<String,Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            map.put(queries[i],0);
        }
        for(int i = 0;i<strings.length;i++){
            if(map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i])+1);
            }
        }
        int arr[] = new int[map.size()];
        int i = 0;
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> e : set){
            arr[i] =e.getValue();
            i++;
        }
        return arr;

    }

    public static void main(String args[]){
        String[] strings = {"aba","baba","aba","xzxb"};
        String[] queries = {"aba","xzxb","ab"};
        int arr[] = matchingStrings(strings,queries);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

}
