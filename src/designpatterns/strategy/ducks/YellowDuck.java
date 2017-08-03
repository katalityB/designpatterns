package designpatterns.strategy.ducks;

public class YellowDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm yellow bath duck");
    }

    public YellowDuck(){
        flyBehavior = new FlyBehaviorNon();
        quackBehavior = new QuackBehaviorNon();
    }
}
