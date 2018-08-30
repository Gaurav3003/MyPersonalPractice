package demo.practice.oracle;

/*
Find  whether given word is rotated version of same word.
e.g.  abcdef efabcd true
      abcdef afdceb false
 */
public class CheckWordRotation {
    public static void main(String args[]){
        String inputStr1 = "abcdef";
        String inputStr2 = "efabcd";

        checkRotationMethod1(inputStr1,inputStr2);

        checkRotationMethod2(inputStr1,inputStr2);

    }

    private static void checkRotationMethod2(String inputStr1, String inputStr2) {
        if(inputStr1.length()!=inputStr2.length()){
            return;
        }
        String newString = inputStr1.concat(inputStr1);
        if(newString.contains(inputStr2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    private static void checkRotationMethod1(String inputStr1, String inputStr2) {
        if(inputStr1.length()!=inputStr2.length()){
            return;
        }

        int index1 = inputStr1.indexOf(inputStr2.charAt(0));
        int index2 = inputStr2.indexOf(inputStr1.charAt(0));

        if(index1==-1 || index2==-1){
            return;
        }

        boolean flag1 = inputStr1.substring(0,index1).equals(inputStr2.substring(index2,inputStr2.length()));
        boolean flag2 = inputStr2.substring(0,index2).equals(inputStr1.substring(index1,inputStr1.length()));

        if(flag1 && flag2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
