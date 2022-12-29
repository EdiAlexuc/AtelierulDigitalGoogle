package Projects.DesignPatterns.FirstExample;

public class NoDiscount implements DiscountStrategy{
    public double calculateDiscount(double total) {
        return 0;
    }
}
