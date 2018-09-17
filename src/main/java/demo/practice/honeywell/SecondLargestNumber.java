package demo.practice.honeywell;

public class SecondLargestNumber {

    public static void main(String args[]){
        int arr[] = {2,43,5,3,8,30,21,50,42,31};
        int largest = Integer.MIN_VALUE;
        int secondlargest = largest ;
        for(int i =0;i<arr.length;i++){

            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }
        }

        System.out.println(largest+"  "+secondlargest);
    }
}
