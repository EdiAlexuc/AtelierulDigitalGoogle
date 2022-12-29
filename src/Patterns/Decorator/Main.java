package Patterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Topping milk = new Milk(coffee);
        Beverage milkChocolateCoffee = new Chocolate(milk);
        System.out.println(milkChocolateCoffee.getDescription());
        System.out.println(milkChocolateCoffee.getCost());

        Beverage milkTea = new Milk(new Tea());
        System.out.println(milkTea.getDescription());
        System.out.println(milkTea.getCost());
    }
}
