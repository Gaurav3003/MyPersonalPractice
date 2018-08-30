package java8.parameterized.behavior;

public class AppleRedPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("Red");
    }
}
