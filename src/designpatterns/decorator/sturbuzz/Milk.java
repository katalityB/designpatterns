package designpatterns.decorator.sturbuzz;

public class Milk extends CondimentsDecorator {
    Beverage beverage;

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
}
