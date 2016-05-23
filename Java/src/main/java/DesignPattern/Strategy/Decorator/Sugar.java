package DesignPattern.Strategy.Decorator;

/**
 * Created by wwh on 16-5-23.
 */
public class Sugar extends CondimentDecorator {
    public Sugar(Drink decoratorDrink) {
        super(decoratorDrink);
    }

    @Override
    public float cost() {
        return super.cost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " sugar";
    }
}
