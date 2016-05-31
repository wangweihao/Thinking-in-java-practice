package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public class StopState extends LiftState {
    public StopState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("处于停止状态：开门");
        lift.setState(lift.getOpenState());
    }

    @Override
    public void close() {
        System.out.println("处于停止状态...什么也不做");
    }

    @Override
    public void run() {
        System.out.println("处于停止状态：运行");
        lift.setState(lift.getRunState());
    }

    @Override
    public void stop() {
        System.out.println("处于停止状态...什么也不做");
    }

    @Override
    public void bug() {
        System.out.println("处于停止状态：维修电梯");
        lift.setState(lift.getBugState());
    }
}
