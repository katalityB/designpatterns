package designpatterns.factory.pizza.first;

public class PizzaApp {
    public static void orderPizza(){
        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("cheese");

        System.out.println("------------------------------------------------------------");

        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
    }
}
