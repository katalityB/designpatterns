package designpatterns.strategy.ducks;

public class FlyBehaviorRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flyBehavior like a rocket");
    }
}
