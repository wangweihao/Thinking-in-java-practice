package DesignPattern.Strategy.Adapter;

/**
 * Created by wwh on 16-5-30.
 */
public class TurkeyAdatptor implements Duck {
    Turkey turkey;

    public TurkeyAdatptor(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
