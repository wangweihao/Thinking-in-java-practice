package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public class RunState extends LiftState {
    public RunState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("处于运行状态...什么也不做");
    }

    @Override
    public void close() {
        System.out.println("处于运行状态...什么也不做");
    }

    @Override
    public void run() {
        System.out.println("处于运行状态...什么也不做");
    }

    @Override
    public void stop() {
        System.out.println("处于运行状态：停止");
        lift.setState(lift.getStopState());
    }

    @Override
    public void bug() {
        System.out.println("处于运行状态：出故障了");
        lift.setState(lift.getBugState());
    }
}
