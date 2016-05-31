package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public abstract class LiftState {
    Lift lift;

    public LiftState(Lift lift) {
        this.lift = lift;
    }

    //开门动作
    public abstract void open();
    //关门动作
    public abstract void close();
    //运行动作
    public abstract void run();
    //停止动作
    public abstract void stop();
    //故障
    public abstract void bug();
}
