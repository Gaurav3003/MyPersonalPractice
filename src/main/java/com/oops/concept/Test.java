package com.oops.concept;

public class Test {
    public static void main(String args[]){
        Parent p = new Child();
        p.print();
        //p.display();
        Child c = new Child();
        c.print();
        c.display();

        Parent p1 = new Parent();
        p1.print();

        //p1 = c;
        p1.print();

        c = (Child) p;
        c.show(1,2);
    }
}
