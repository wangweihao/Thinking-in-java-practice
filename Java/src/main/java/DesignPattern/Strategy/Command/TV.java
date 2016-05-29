package DesignPattern.Strategy.Command;

/**
 * Created by wwh on 16-5-29.
 */
public class TV implements HouseholdAppliances {
    public void on() {
        System.out.println("the TV on");
    }

    public void off() {
        System.out.println("the TV off");
    }
}
