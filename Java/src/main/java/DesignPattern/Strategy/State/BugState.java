package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-6-1.
 */
public class BugState extends LiftState {
    public BugState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("故障状态，不能打开");
    }

    @Override
    public void close() {
        System.out.println("故障状态，不能关闭");
    }

    @Override
    public void run() {
        System.out.println("故障状态，不能运行");
    }

    @Override
    public void stop() {
        System.out.println("故障状态，停止..维修");
        lift.setState(lift.getStopState());
    }

    @Override
    public void bug() {
        System.out.println("故障状态");
    }
}
