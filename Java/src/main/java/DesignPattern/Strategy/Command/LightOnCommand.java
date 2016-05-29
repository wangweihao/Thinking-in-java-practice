package DesignPattern.Strategy.Command;

/**
 * Created by wwh on 16-5-29.
 */
public class LightOnCommand implements Command {
    private Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
