package java8.parameterized.behavior;

import java.io.IOException;

public class Parent {

    public int show(String str) throws IOException{
        return 1;
    }
}


class Child extends Parent{

    @Override
    public int show(String str){
        return 2;
    }
}