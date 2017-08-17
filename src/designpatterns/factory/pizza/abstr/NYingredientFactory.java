package designpatterns.factory.pizza.abstr;

public class NYingredientFactory implements PizzaIngredientFactory {

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public Dough createDough(){
        return new ThinDough();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new RedPepper(), new EggPlant(), new Mushroom()};
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
