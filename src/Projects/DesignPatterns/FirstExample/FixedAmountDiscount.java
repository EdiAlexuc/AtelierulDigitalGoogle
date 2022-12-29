package Projects.DesignPatterns.FirstExample;

public class FixedAmountDiscount implements DiscountStrategy{
    private double amount;

    public FixedAmountDiscount(double amount){
        this.amount = amount;
    }

    public double calculateDiscount(double total){
        return amount;
    }
}
