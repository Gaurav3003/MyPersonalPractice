package demo.practice.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        if(s==null || s.isEmpty() || s.length()%2!=0){
            return "NO";
        }

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            switch (ch){
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek()!='('){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek()!='{'){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek()!='['){
                        return "NO";
                    }
                    stack.pop();
                    break;
            }

        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       /* int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            //String result = isBalanced(s);
            System.out.println(isBalanced(s));
        }
        scanner.close();*/
       String result = isBalanced("((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}");
        System.out.println(result);
    }
}
