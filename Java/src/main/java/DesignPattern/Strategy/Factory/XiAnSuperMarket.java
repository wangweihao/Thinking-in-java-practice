package DesignPattern.Strategy.Factory;

/**
 * Created by wwh on 16-5-24.
 */
public class XiAnSuperMarket extends SuperMarket {
    @Override
    protected Food findFood(String type) {
        if (type.equals("milk")) {
            return new Milk();
        }else if (type.equals("sugar")) {
            return new Sugar();
        }else
            return null;
    }
}