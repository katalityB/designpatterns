package designpatterns.strategy.ducks;

public abstract class Duck {
    /*
    * Every duck has quackBehavior and flyBehavior properties
    * (which is incapsulated to the interface)
    * Every duck has display method
    * */

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("I can swim");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
