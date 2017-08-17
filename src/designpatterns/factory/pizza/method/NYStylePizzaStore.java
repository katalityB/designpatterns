package designpatterns.factory.pizza.method;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYCheesePizza();
        }else if(type.equals("clam")){
            return new NYClamPizza();
        }else if(type.equals("pepperoni")){
            return new NYPepperoniPizza();
        }else if(type.equals("veggie")){
            return new NYPepperoniPizza();
        }else return null;
    }
}
