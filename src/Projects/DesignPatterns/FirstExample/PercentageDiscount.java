package Projects.DesignPatterns.FirstExample;

public class PercentageDiscount implements DiscountStrategy{
    private double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }

    public double calculateDiscount(double total){
        return total * percentage;
    }
}
