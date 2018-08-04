package com.reflection;

public class MainTest {

    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Employee emp =  (Employee)Class.forName("PermanentEmployee").newInstance();




    }
}
