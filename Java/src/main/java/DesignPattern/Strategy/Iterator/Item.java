package DesignPattern.Strategy.Iterator;

/**
 * Created by wwh on 16-5-30.
 */
public class Item {
    private String name;
    private String description;
    double price;

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
