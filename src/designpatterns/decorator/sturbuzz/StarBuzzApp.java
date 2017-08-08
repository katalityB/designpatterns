package designpatterns.decorator.sturbuzz;
import java.text.DecimalFormat;

public class StarBuzzApp {

    static DecimalFormat df = new DecimalFormat("###.##");

    public static void decorator(){
        Beverage americano = new Americano();
        System.out.println(americano.getDescription() + ' ' + df.format(americano.cost()) + '$');

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + ' ' + df.format(beverage2.cost()) + '$');

        Beverage beverage3 = new Americano();
        beverage3 = new Milk(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + ' ' + df.format(beverage3.cost()) + '$');
    }
}
