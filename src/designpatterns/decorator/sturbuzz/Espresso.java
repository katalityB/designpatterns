package designpatterns.decorator.sturbuzz;

public class Espresso extends Beverage {
    public double cost(){
        return 1.99;
    }

    public Espresso(){
        description = "Espresso";
    }
}
