package Projects.DesignPatterns.FirstExample;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private DiscountStrategy discountStrategy;
    private List<Item> items;

    public Order(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public double calculateTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total - discountStrategy.calculateDiscount(total);
    }
}
