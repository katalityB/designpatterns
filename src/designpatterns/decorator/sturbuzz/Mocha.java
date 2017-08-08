package designpatterns.decorator.sturbuzz;

public class Mocha extends CondimentsDecorator {
    Beverage beverage;

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
}
