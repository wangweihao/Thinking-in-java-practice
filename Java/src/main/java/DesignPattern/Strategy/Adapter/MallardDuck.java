package DesignPattern.Strategy.Adapter;

/**
 * Created by wwh on 16-5-30.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
