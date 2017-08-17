package designpatterns.factory.pizza.abstr;

public class PizzaAppAF {
    public static void orderPizza(){
        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("cheese");

        System.out.println("------------------------------------------------------------");

        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
    }
}
