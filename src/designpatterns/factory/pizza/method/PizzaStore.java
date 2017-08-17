package designpatterns.factory.pizza.method;

public abstract class PizzaStore {
    public void orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.tossingDough();
        pizza.addSauce();
        pizza.addTopping();
        pizza.bake();
        pizza.cutting();
        pizza.packing();
        pizza.ready();
    }

    protected abstract Pizza createPizza(String type);
}
