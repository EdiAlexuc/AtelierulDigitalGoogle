package DesignPatterns.Decorator;

public class Chocolate extends Topping{
    public Chocolate( Beverage beverage) {
        super("Chocolate", 4, beverage);
    }
}
