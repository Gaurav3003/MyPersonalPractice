package demo.practice.goldmansach;
/*
Add two fraction a/b and c/d and print answer in simplest form.

Examples :

Input:  1/2 + 3/2
Output: 2/1

Input:  1/3 + 3/9
Output: 2/3

Input:  1/5 + 3/15
Output: 2/5
 */
public class AddTwoFraction {

    public static void main(String args[]){
        int arr1[]={2,3};
        int arr2[]={2,4};
        int sum[] = addFraction(arr1,arr2);
        System.out.println("{"+sum[0]+", "+sum[1]+"}");
    }

    private static int[] addFraction(int arr1[],int arr2[]){

        int numerator = (arr1[0] * arr2[1]) + (arr1[1] * arr2[0]);
        int denominator = arr1[1] * arr2[1];
        int gcd = findGCD(numerator,denominator);
        numerator = numerator/gcd;
        denominator = denominator/gcd;
        int sum[]= {numerator,denominator};
        return sum;
    }

    private static int findGCD(int a, int b){
        if(a==0 || b==0){
            return 0;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return findGCD(a-b,b);
        }else{
            return findGCD(a, b-a);
        }
    }
}

