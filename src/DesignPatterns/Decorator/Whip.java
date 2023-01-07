package DesignPatterns.Decorator;

public class Whip extends Topping{
    public Whip(Beverage beverage) {
        super("Whip", 3, beverage);
    }
}
