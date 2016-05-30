package DesignPattern.Strategy.TemplateMethod;

/**
 * Created by wwh on 16-5-30.
 */
public abstract class CoffeeShopBeverage {
    //模板方法，制作步骤
    final void prepareRecipe() {
        boidWater();
        brew();
        pourInCup();
        if (isAddCondiments()) {
            addCondiments();
        }
    }

    //冲泡
    abstract void brew();
    //加调料
    abstract void addCondiments();

    //固定步骤
    void boidWater() {
        System.out.println("加热水...");
    }
    void pourInCup() {
        System.out.println("倒入杯中...");
    }

    //钩子函数，来决定是否加调料
    boolean isAddCondiments() {
        return true;
    }
}
