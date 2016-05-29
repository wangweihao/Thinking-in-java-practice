package DesignPattern.Strategy.Adapter;

/**
 * Created by wwh on 16-5-30.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm fly a short distance");
    }
}
