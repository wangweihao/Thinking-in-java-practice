package DesignPattern.Strategy.Command;

/**
 * Created by wwh on 16-5-29.
 */
public class Light implements HouseholdAppliances{
    public void on() {
        System.out.println("the light on");
    }

    public void off() {
        System.out.println("the light off");
    }
}
