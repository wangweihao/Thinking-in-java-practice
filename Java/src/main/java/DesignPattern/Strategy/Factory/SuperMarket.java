package DesignPattern.Strategy.Factory;

/**
 * Created by wwh on 16-5-24.
 */
public abstract class SuperMarket {
    public Food buyFood(String type) {
        Food food;

        food = findFood(type);

        return food;
    }

    protected abstract Food findFood(String type);
}
