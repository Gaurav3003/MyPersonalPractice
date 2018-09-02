package demo.practice.hackerrank;

import java.util.*;

/*
Check out the resources on the page's right side to learn more about hashing. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.

Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the right words, but there's a case mismatch. The answer NO

input:
6 4
give me one grand today night
give one grand today
output:
Yes

input:
6 5
two times three is not four
two times two is four
output;
No
Explanation

'two' only occurs once in the magazine.
 */
public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {

        if(magazine.length<note.length){
            System.out.println("No");
            return;
        }
        boolean flag = true;
        Map<String,Integer> list = new HashMap<>();
        for(int i = 0;i<magazine.length;i++){
            if(list.containsKey(magazine[i])){
                int count = list.get(magazine[i]);
                list.put(magazine[i],++count);
            }else{
                list.put(magazine[i],1);
            }
        }
        for(int i = 0;i<note.length;i++){
            if(list.containsKey(note[i])){
                int count = list.get(note[i]);
                if(count<=0){
                   flag = false;
                   break;
                }
                list.put(note[i],--count);
            }
            else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
