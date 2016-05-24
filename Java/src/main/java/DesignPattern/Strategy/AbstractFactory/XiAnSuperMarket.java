package DesignPattern.Strategy.AbstractFactory;

/**
 * Created by wwh on 16-5-24.
 */
public class XiAnSuperMarket implements AbstractSuperMarket {
    public Milk CreateMilk() {
        return new XiAnMilk();
    }

    public Sugar CreateSugar() {
        return new XiAnSugar();
    }
}
