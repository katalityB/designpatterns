package designpatterns.factory.pizza.first;

public class PizzaStore {
    public static void orderPizza(){
        ChicagoCheesePizza chicagoCheesePizza = new ChicagoCheesePizza();
        chicagoCheesePizza.tossingDough();
        chicagoCheesePizza.addSauce();
        chicagoCheesePizza.addTopping();
        chicagoCheesePizza.bake();
        chicagoCheesePizza.cutting();
        chicagoCheesePizza.packing();
        chicagoCheesePizza.ready();
    }
}
