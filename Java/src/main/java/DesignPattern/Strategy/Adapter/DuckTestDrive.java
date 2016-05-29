package DesignPattern.Strategy.Adapter;

/**
 * Created by wwh on 16-5-30.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdatptor(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe Adatper Duck says");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
