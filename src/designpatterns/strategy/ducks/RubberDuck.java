package designpatterns.strategy.ducks;

public class RubberDuck extends Duck{
        @Override
        public void display() {
            System.out.println("I'm rubber duck");
        }

    public RubberDuck(){
        flyBehavior = new FlyBehaviorNon();
        quackBehavior = new QuackBehaviorNon();
    }
}
