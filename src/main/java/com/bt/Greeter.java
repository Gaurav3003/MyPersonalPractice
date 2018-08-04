package com.bt;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String args[]){



        Greeter greeter = new Greeter();

        Greeting helloGreeting = new HelloGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World, Lambda");

        //Annonymous Innerclass
        Greeting innerGreetingClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner class greeting");
            }
        };

        helloGreeting.perform();
        lambdaGreeting.perform();
        innerGreetingClass.perform();






    }
}

