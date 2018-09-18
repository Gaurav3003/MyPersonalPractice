package honeywell.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindTriplets {

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int n = arr.length;
        String input = "";
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader in = new BufferedReader(reader);) {
            input = in.readLine();
            findTriplets(input, n);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

    private static void findTriplets(String input, int n)
    {
        String[] inputArr = input.split(" ");
        int arr[] = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        boolean found = true;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            return;
        }
    }


}
