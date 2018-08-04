package com.bt;

public class TypeInferenceExample {

    public static void main(String args[]){
        StringLengthLambda stringLengthLambda = str -> str.length();
        System.out.println(stringLengthLambda.getLength("Hello Lambda"));

        //type Inference
        printLambda(str -> str.length());
    }


    public static void printLambda(StringLengthLambda lambda){
        System.out.println(lambda.getLength("Hello Lambda"));
    }

    interface StringLengthLambda{
        int getLength(String str);
    }
}
