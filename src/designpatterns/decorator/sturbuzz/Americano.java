package designpatterns.decorator.sturbuzz;

public class Americano extends Beverage {
    public double cost(){
        return 1.99;
    }

    public Americano(){
        description = "Americano";
    }
}
