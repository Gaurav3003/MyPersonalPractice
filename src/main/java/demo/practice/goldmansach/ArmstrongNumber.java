package demo.practice.goldmansach;
/*
1634 = 1^4+6^4+3^4+4^4
 */
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print(isArmstrong(input));
        sc.close();


    }

    private static boolean isArmstrong(int input){
        int size = String.valueOf(input).length();
        int sum = 0;
        int temp = input;
        while(input!=0) {
            int num = input % 10;
            sum = sum + (int) Math.pow(num, size);
            input = input / 10;
        }

        return (sum==temp);
    }

}
