package DesignPattern.Strategy.Decorator;

/**
 * Created by wwh on 16-5-23.
 */
public class Coffee implements Drink {
    final private String description = "coffee";

    public float cost() {
        return 10;
    }

    public String getDescription() {
        return description;
    }
}
