package designpatterns.factory.pizza.method;

public abstract class Pizza {
    public String dough;
    public String sauce;
    public String filling;

    public void tossingDough(){
        System.out.println("Tossing dough: " + dough);
    }

    public void addSauce(){
        System.out.println("Adding sauce: " + sauce);
    }

    public void addTopping(){
        System.out.println("Adding topping: " + filling);
    }

    public void bake(){
        System.out.println("Bake for 25 min");
    }

    public void cutting(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void packing(){
        System.out.println("Place pizza in official box");
    }

    public void ready(){
        System.out.println("Pizza ready!");
    }

}
