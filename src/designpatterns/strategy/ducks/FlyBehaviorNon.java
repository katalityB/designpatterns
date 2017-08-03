package designpatterns.strategy.ducks;

public class FlyBehaviorNon implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm non flyable");
    }
}
