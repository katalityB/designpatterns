package designpatterns.factory.pizza.abstr;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggie = ingredientFactory.createVeggies();
        System.out.println(dough);
        System.out.println(sauce);
        System.out.println(cheese);
        System.out.println(veggie);
    }
}
