package App;

import Business.*;
import Service.*;

public class App {
    public static void main(String[] args) {
        Helper helper = new Helper();

        /* Plain Coffee */
        Coffee plainCoffee = new PlainCoffee();
        plainCoffee.printDesc();
       System.out.print(". Der Preis betraegt " + plainCoffee.getPrice());
        helper.endLine();

        /* Kaffee Latte */
        Coffee coffeeLatte = new MilkDeco(plainCoffee);
        coffeeLatte.printDesc();
        System.out.print( ". Der Preis betraegt " + coffeeLatte.getPrice());
        helper.endLine();

        /*  Latte mit Schuss */
        Coffee latteMitSchuss = new MilkDeco(new AmarettoDeco(new PlainCoffee()));
        latteMitSchuss.printDesc();
        System.out.print( ". Der Preis betraegt " + latteMitSchuss.getPrice());
        helper.endLine();
    }
}