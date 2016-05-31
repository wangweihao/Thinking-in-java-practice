package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public class CloseState extends LiftState {
    public CloseState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("处于关闭状态...什么也不做");
    }

    @Override
    public void close() {
        System.out.println("处于关闭状态...什么也不做");
    }

    @Override
    public void run() {
        System.out.println("处于关闭状态：运行");
        lift.setState(lift.getRunState());
    }

    @Override
    public void stop() {
        System.out.println("处于关闭状态...什么也不做");
    }

    @Override
    public void bug() {
        System.out.println("处于关闭状态...出故障了");
        lift.setState(lift.getBugState());
    }
}
