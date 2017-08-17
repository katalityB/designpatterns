package designpatterns.factory.pizza.abstr;

public abstract class PizzaStore {
    public void orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cutting();
        pizza.packing();
        pizza.ready();
    }

    protected abstract Pizza createPizza(String type);
}
