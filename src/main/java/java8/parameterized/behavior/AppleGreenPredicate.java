package java8.parameterized.behavior;

public class AppleGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("Green");
    }
}

