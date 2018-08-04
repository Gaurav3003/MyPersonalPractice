package demo.generics;

public class GenericMethod {

    public static <T> boolean isEqual(GenericsType<T> g1,GenericsType<T> g2){
        return g1.getT().equals(g2.getT());
    }

    public static void main(String args[]){
        GenericsType<String> g1 = new GenericsType<>();
        g1.setT("Smruti");

        GenericsType<String> g2 = new GenericsType<>();
        g2.setT("Smruti");

        //boolean isEqual = GenericMethod.<String>isEqual(g1,g2);
        boolean isEqual = GenericMethod.isEqual(g1,g2); //TypeInference
        System.out.println(isEqual);
    }
}
