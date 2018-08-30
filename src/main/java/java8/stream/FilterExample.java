package java8.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");

        //traditional style
        /*for(String name : names){
            if(!name.equals("Sam")){
                System.out.println(name);
            }
        }*/


        names.stream()
                .filter(name -> !name.equals("Sam"))
                .forEach(System.out::println);

    }
}
