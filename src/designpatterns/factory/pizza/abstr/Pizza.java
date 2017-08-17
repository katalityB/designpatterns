package designpatterns.factory.pizza.abstr;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggie[];
    Clams clams;
    Pepperoni pepperoni;

    abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }
}
