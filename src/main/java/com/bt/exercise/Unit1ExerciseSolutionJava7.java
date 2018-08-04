package com.bt.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String args[]){
        List<Person> people = Arrays.asList(
                new Person("Smrutirekha","Khatua",28),
                new Person("Samir","Behere",27),
                new Person("Sandhya","H S",28),
                new Person("Aswini","Parida",28),
                new Person("Rajendra","Majhi",29)
        );


        //Step - 1 sort list by lastname
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step - 2 create a method that prints all elememnts in the list
        System.out.println("Printing all teh elements");
        printAll(people);

        //Step - 3 create a method that prints all the people that have last name beginning with S
        System.out.println("Printing all ll the people that have last name beginning with S");
        printFirstNameWithS(people);


        System.out.println("Printing all ll the people that have last name beginning with S with Condition being passed");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("S");
            }
        });

    }

    private static void printFirstNameWithS(List<Person> people) {
        for (Person p: people) {
            if(p.getFirstName().startsWith("S"))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p: people) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people,Condition condition) {
        for (Person p: people) {
            if(p.getFirstName().startsWith("S"))
                System.out.println(p);
        }
    }
}

interface Condition{
    boolean test(Person p);
}
