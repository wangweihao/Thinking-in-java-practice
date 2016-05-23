package DesignPattern.Strategy.Decorator;

/**
 * Created by wwh on 16-5-23.
 */
public class CoffeeShop {
    public static void main(String[] args) {
        //点一杯coffee
        Drink drink = new Coffee();
        System.out.println(drink.getDescription() + ":" + drink.cost());
        //加一份奶
        drink = new Milk(drink);
        System.out.println(drink.getDescription() + ":" + drink.cost());
        //加一份糖
        drink = new Sugar(drink);
        System.out.println(drink.getDescription() + ":" + drink.cost());
        //在加一份糖
        drink = new Sugar(drink);
        System.out.println(drink.getDescription() + ":" + drink.cost());
    }
}
