package demo.enums.basic;


import java.util.HashMap;

class A{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}

public class BasicEnumTest {

    public static void main(String []args){
       /* System.out.println(WeekDays.MONDAY);

        //looping over enum
        for(WeekDays weekDays:WeekDays.values()){
            System.out.println(weekDays);
        }


        String str = "Hello";
        concat(str);
        System.out.println(str);*/

       String a = new String("Hello");

       System.out.println(a);

        System.out.println(a);

    }


    static void merge(String a){
        a = new String("World");
    }
}
