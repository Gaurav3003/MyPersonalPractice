package honeywell.test;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class NthLargestNumber {
    public static void main(String arg[]) throws Exception {
        /*String input="12 2 42 6 31 9 55";
        int n = 3;*/
        String input="";
        int n;
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader);) {
            input = in.readLine();
            n = Integer.parseInt(in.readLine());
            printNthElements(input,n);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    private static void printNthElements(String input, int n) {
        if (null != input && !input.isEmpty()) {
            String []arr = input.split(" ");
            int inputArr[] = new int[arr.length];
            int largest[] = new int[n];
            int largestNum;
            int index;
            for(int i = 0;i <inputArr.length;i++){
                inputArr[i] = Integer.parseInt(arr[i]);
            }

            for (int j = 0; j < n; j++) {
                largestNum = inputArr[0];
                index = 0;
                for (int i = 1; i < inputArr.length; i++) {
                    if (largestNum < inputArr[i]) {
                        largestNum = inputArr[i];
                        index = i;
                    }
                }
                largest[j] = largestNum;
                inputArr[index] = Integer.MIN_VALUE;

                System.out.print(largest[j]+"\t");
            }

        }


    }
}
