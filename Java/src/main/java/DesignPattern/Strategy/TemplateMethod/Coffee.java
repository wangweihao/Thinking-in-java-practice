package DesignPattern.Strategy.TemplateMethod;

/**
 * Created by wwh on 16-5-30.
 */
public class Coffee extends CoffeeShopBeverage {
    @Override
    void brew() {
        System.out.println("放入咖啡...");
    }

    @Override
    void addCondiments() {
        System.out.println("加奶和糖...");
    }
}
