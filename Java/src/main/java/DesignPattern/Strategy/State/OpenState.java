package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public class OpenState extends LiftState {
    public OpenState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("处于开门状态...什么也不错");
    }

    @Override
    public void close() {
        System.out.println("处于开门状态：关门");
        lift.setState(lift.getCloseState());
    }

    @Override
    public void run() {
        System.out.println("处于开门状态...什么也不错");
    }

    @Override
    public void stop() {
        System.out.println("处于开门状态...什么也不错");
    }

    @Override
    public void bug() {
        System.out.println("处于开门状态：出故障了...");
        lift.setState(lift.getBugState());
    }
}
