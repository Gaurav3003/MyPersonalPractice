package demo.practice.hackerrank;

import java.util.*;

public class BitWiseAndTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);
            }
            //test(n,k);
        }

        scanner.close();
    }

    public static void test(int n , int k){
        List<Integer> set = new ArrayList<>();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i = 0 ;i<n-1;i++){
            for(int j = 1;j<n;j++){
                int flag = arr[i] & arr[j];
                if(flag<k){
                    set.add(flag);
                }
            }
        }

        Collections.sort(set);
        System.out.println(set.get(set.size()-1));

    }
}
