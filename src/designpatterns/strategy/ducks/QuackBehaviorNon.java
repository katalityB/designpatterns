package designpatterns.strategy.ducks;

public class QuackBehaviorNon implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quackBehavior");
    }
}
