package java8.parameterized.behavior;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("Red") && apple.getWeight()>150;
    }
}
