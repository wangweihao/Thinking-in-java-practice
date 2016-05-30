package DesignPattern.Strategy.TemplateMethod;

/**
 * Created by wwh on 16-5-30.
 */
public class Tea extends CoffeeShopBeverage {
    @Override
    void brew() {
        System.out.println("放入茶叶...");
    }

    @Override
    void addCondiments() {
        System.out.println("加柠檬...");
    }

    //默认不加柠檬
    @Override
    boolean isAddCondiments() {
        System.out.println("什么也不加...");
        return false;
    }
}
