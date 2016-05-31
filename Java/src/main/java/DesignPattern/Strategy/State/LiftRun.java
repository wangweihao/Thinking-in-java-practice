package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public class LiftRun {
    public static void main(String[] args) {
        //其实设置为停止状态
        Lift lift = new Lift();
        //运行
        lift.run();
        lift.bug();
        lift.stop();
        lift.run();
    }
}
