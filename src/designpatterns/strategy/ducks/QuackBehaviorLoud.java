package designpatterns.strategy.ducks;

public class QuackBehaviorLoud implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm quackBehavior Loudly");
    }
}
