package designpatterns.strategy.ducks;

public class DuckSimulator {
    public static void strategy() {
        Duck real = new RealDuck();
        real.display();
        real.performFly();
        real.performQuack();
        real.swim();
        System.out.println("--------------------------------");
        Duck yellow = new YellowDuck();
        yellow.display();
        yellow.performFly();
        yellow.performQuack();
        yellow.swim();
        System.out.println("--------------------------------");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.swim();
        rubber.setFlyBehavior(new FlyBehaviorRocket());
        rubber.performFly();
    }
}
