package DesignPatterns.Decorator;

public class Milk extends Topping{
    public Milk(Beverage beverage) {
        super("Milk", 5, beverage);
    }
}
