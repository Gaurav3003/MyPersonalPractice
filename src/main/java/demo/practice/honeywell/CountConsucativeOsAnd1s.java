package demo.practice.honeywell;
/*
hey have given 3 question which you need to code on their laptop and print the output.
Q1. an array consist 0s & 1s, find the maximum number of consecutive 1s and consecutive 0s.
Ex- 0 0 0 1 1 1 1 0 0 1
max 1s count=4
max 0s count=3
 */
public class CountConsucativeOsAnd1s {
     public static void main(String[] args) {
     int[] numbers = {1,1,1,1,0,0,0,0,1,1,1,1,1};
     countSuccessiveb(numbers);
    }

    public static void countSuccessiveb (int[] values) {
        int maxZeroLength = 0;
        int tempLengthZeroLength = 0;
        int maxOneLength = 0;
        int tempLengthOneLength = 0;

        for (int value : values) {
            tempLengthZeroLength = (value == 0) ? 1 + tempLengthZeroLength : 0;
            if (tempLengthZeroLength > maxZeroLength) {
                maxZeroLength = tempLengthZeroLength;
            }
            tempLengthOneLength = (value == 1) ? 1 + tempLengthOneLength : 0;
            if (tempLengthOneLength > maxOneLength) {
                maxOneLength = tempLengthOneLength;
            }

        }
        System.out.println(maxOneLength+"  "+maxZeroLength);
    }

}
