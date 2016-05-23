package DesignPattern.Strategy.Decorator;

/**
 * Created by wwh on 16-5-23.
 */
public abstract class CondimentDecorator implements Drink {
    protected Drink decoratorDrink;

    public CondimentDecorator(Drink decoratorDrink) {
        this.decoratorDrink = decoratorDrink;
    }

    public float cost() {
        return decoratorDrink.cost();
    }

    public String getDescription() {
        return decoratorDrink.getDescription();
    }
}
