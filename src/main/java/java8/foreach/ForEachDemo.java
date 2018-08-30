package java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String args[]){
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("Sameer");
        list.add(3);
        list.add(4);

       /* //Way-1
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer*2+"\t");
            }
        });
        System.out.println();
        //Way-2
        Consumer<Integer> consumer = integer -> {System.out.print(integer*2+"\t");};
        list.forEach(consumer);

        System.out.println();
        //Way-3 (lambda)
        list.forEach(integer -> {System.out.print(integer*2+"\t");});*/

        Iterator<Object> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
