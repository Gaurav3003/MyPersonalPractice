package demo.enums.methods;

public enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    double calculate(double x, double y){
        switch(this){
            case PLUS:
                return x+y;
            case MINUS:
                if(x>y){
                    return x-y;
                }else{
                    return y-x;
                }
            case TIMES:
                return  x*y;
            case DIVIDE:
                return x/y;
            default:
                throw new AssertionError("Unknown operation"+this);
        }
    }
}
