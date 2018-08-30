package java8.parameterized.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AppleMainTest {

    public static void main(String args[]){
        Apple a1 = new Apple("Red",160);
        Apple a2 = new Apple("Red",180);
        Apple a3 = new Apple("Red",100);
        Apple a4 = new Apple("Red",110);

        Apple a5 = new Apple("Green",170);
        Apple a6 = new Apple("Green",190);
        Apple a7 = new Apple("Green",90);
        Apple a8 = new Apple("Green",80);

        List<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);
        appleList.add(a4);
        appleList.add(a5);
        appleList.add(a6);
        appleList.add(a7);
        appleList.add(a8);

        ApplePredicate applePredicate = new AppleRedAndHeavyPredicate();
        //Using implemeting class
        List<Apple> list = filterApple(appleList, applePredicate);
        System.out.println("Using class implementation : Red Heavy Apple");
        System.out.println(list);


        //Using implemeting class
        list = filterApple(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "Green".equalsIgnoreCase(apple.getColor()) && apple.getWeight()<150;
            }
        });
        System.out.println("Using anonymous class : Green Light apple");
        System.out.println(list);

        //Using lambda
        list = filterApple(appleList, apple -> {
            return "Red".equalsIgnoreCase(apple.getColor()) && apple.getWeight()<150;
        });
        System.out.println("Using Lambda - 1 : Red Light apple");
        System.out.println(list);

        list = filterApple(appleList, apple ->"Green".equalsIgnoreCase(apple.getColor()) && apple.getWeight()>150);
        System.out.println("Using Lambda - 2 : Green Heavy apple");
        System.out.println(list);

        //using Predicate interface fo rmore generic
        list = filter(appleList, apple ->"Green".equalsIgnoreCase(apple.getColor()) && apple.getWeight()>150);
        System.out.println("Using Predicate interface : Green Heavy apple");
        System.out.println(list);


        Comparator<Apple> appleComparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return (int) o1.getWeight()-(int)o2.getWeight();
            }
        };


        Collections.sort(appleList,appleComparator);
        System.out.println("Sorted list: Ascending");
        System.out.println(appleList);

        Comparator<Apple> appleComparator1 = (Apple ap1,Apple ap2)-> (int)ap2.getWeight()-(int)ap1.getWeight();

        Collections.sort(appleList,appleComparator1);
        System.out.println("Sorted list: Descending");
        System.out.println(appleList);

        appleList.stream();


    }

    private static List<Apple> filterApple(List<Apple> appleList,ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple:appleList){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


    private static <T> List<T> filter(List<T> list,Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for(T e:list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }



}
