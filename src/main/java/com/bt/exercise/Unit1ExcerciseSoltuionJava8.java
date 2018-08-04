package com.bt.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExcerciseSoltuionJava8 {

    public static void main(String args[]){
        List<Person> people = Arrays.asList(
                new Person("Smrutirekha","Khatua",28),
                new Person("Samir","Behere",27),
                new Person("Sandhya","H S",28),
                new Person("Aswini","Parida",28),
                new Person("Rajendra","Majhi",29)
        );
        //Step - 1 sort list by lastname
        Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
        //Step - 2 create a method that prints all elememnts in the list
        System.out.println("Printing all the elements");
        printConditionally(people, p-> true);
        //Step - 3 create a method that prints all the people that have last name beginning with S
        System.out.println("Printing all the people that have last name beginning with S with Condition being passed");
        printConditionally(people, (p)-> p.getFirstName().startsWith("S"));

        System.out.println("Printing all the elements with Condition and behaviour being passed");
        printConditionally1(people, p-> true, p -> System.out.println(p));
    }
    private static void printConditionally(List<Person> people,Predicate<Person> predicate) {
        for (Person p: people) {
            if(predicate.test(p))
                System.out.println(p);
        }
    }
    private static void printConditionally1(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: people) {
            if(predicate.test(p))
               consumer.accept(p);
        }
    }
}

