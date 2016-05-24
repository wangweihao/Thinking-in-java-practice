package DesignPattern.Strategy.AbstractFactory;

/**
 * Created by wwh on 16-5-24.
 */
public class BeiJingSuperMarket implements AbstractSuperMarket {
    public Milk CreateMilk() {
        return new BeiJingMilk();
    }

    public Sugar CreateSugar() {
        return new BeiJingSugar();
    }
}
