package demo.generics;

public class GenericsType<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.setT("Smruti");
        //type.setT(10); compile time error


        GenericsType type1 = new GenericsType();
        type1.setT("Smruti");
        type1.setT(10);
    }
}
