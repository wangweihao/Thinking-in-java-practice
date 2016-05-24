package DesignPattern.Strategy.AbstractFactory;

/**
 * Created by wwh on 16-5-24.
 */
public class BuyFood {
    public static void main(String[] args) {
        //创建北京超市
        AbstractSuperMarket beiJingSuperMarket = new BeiJingSuperMarket();
        Milk milk = beiJingSuperMarket.CreateMilk();
        milk.drink();

        //创建西安超市
        AbstractSuperMarket xianSuperMarket = new XiAnSuperMarket();
        Sugar sugar = xianSuperMarket.CreateSugar();
        sugar.eat();
    }
}
