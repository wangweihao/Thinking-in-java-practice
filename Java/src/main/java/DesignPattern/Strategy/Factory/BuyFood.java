package DesignPattern.Strategy.Factory;

/**
 * Created by wwh on 16-5-24.
 */
public class BuyFood {
    public static void main(String[] args) {
        SuperMarket superMarket = new XiAnSuperMarket();
        Food milk = superMarket.buyFood("milk");

        SuperMarket superMarketB = new BeiJingSuperMarket();
        Food coke = superMarketB.buyFood("coke");
    }
}
