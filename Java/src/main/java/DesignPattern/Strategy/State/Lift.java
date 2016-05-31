package DesignPattern.Strategy.State;

/**
 * Created by wwh on 16-5-31.
 */
public class Lift {
    LiftState openState;
    LiftState closeState;
    LiftState runState;
    LiftState stopState;
    LiftState bugState;

    LiftState state;

    public Lift() {
        openState = new OpenState(this);
        closeState = new CloseState(this);
        runState = new RunState(this);
        stopState = new StopState(this);
        bugState = new BugState(this);
        //起始设置为停止状态
        state = stopState;
    }

    public void stop() {
        state.stop();
    }

    public void run() {
        state.run();
    }

    public void close() {
        state.close();
    }

    public void open() {
        state.open();
    }

    public void bug() {
        state.bug();
    }

    public void setState(LiftState state) {
        this.state = state;
    }

    public LiftState getBugState() {
        return bugState;
    }

    public LiftState getOpenState() {
        return openState;
    }

    public LiftState getCloseState() {
        return closeState;
    }

    public LiftState getRunState() {
        return runState;
    }

    public LiftState getStopState() {
        return stopState;
    }
}
