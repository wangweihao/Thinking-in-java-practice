package DesignPattern.Strategy.Command;

/**
 * Created by wwh on 16-5-29.
 */
public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
