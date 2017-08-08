package designpatterns.decorator.sturbuzz;

public class Whip extends CondimentsDecorator {
    Beverage beverage;

    @Override
    public double cost() {
        return 0.4 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
}
