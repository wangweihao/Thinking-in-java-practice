package DesignPattern.Strategy.Observer;

/**
 * Created by wwh on 16-5-23.
 */
public class TimeConcreteObserver implements TimeObserver,Display {
    private int hour;
    private int minute;
    private int second;
    private TimeSubject timeSubject;

    public TimeConcreteObserver(TimeSubject timeSubject) {
        this.timeSubject = timeSubject;
        timeSubject.registerObserver(this);
    }

    public void update(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display() {
        System.out.println("时:" + hour + " 分:" + minute + " 秒:" + second);
    }
}
