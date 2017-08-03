package designpatterns.strategy.ducks;

public class RealDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm real duck");
    }

    public RealDuck(){
        flyBehavior = new FlyBehaviorRocket();
        quackBehavior = new QuackBehaviorLoud();
    }
}
