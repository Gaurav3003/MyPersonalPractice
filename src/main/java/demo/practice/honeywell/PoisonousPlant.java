package demo.practice.honeywell;

import java.util.Scanner;

public class PoisonousPlant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] plants = new int[n];
        for (int i = 0; i < n; i++) {
            plants[i] = sc.nextInt();
        }
        System.out.println(test(plants));

    }

    public static int test(int[] p) {
        int n = p.length;
        int min = p[0];
        int mdays = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, p[i]);
            if (p[i] > p[i - 1]) {
                int l = p[i];
                int k = i + 1;
                int day = 1;
                while (k < n && min < p[k]) {
                    if (p[k] <= l) {
                        l = p[k];
                        ++day;
                    }
                    ++k;
                }
                mdays = Math.max(mdays, day);
            }
        }
        return mdays;

    }

}