package designpatterns.factory.pizza.first;

public class NYPizza extends Pizza {
    public NYPizza(){
        dough = "Tin crust dough";
        sauce = "Marinara Sauce";
    }

    @Override
    public void cutting() {
        System.out.println("Cutting pizza into square slices");
    }
}
