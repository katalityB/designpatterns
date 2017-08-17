package designpatterns.factory.pizza.abstr;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    public Dough createDough(){
        return new ThickDough();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new RedPepper(), new EggPlant(), new Mushroom()};
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
