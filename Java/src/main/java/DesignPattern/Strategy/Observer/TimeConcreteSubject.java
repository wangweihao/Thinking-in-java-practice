package DesignPattern.Strategy.Observer;

import java.util.ArrayList;

/**
 * Created by wwh on 16-5-23.
 */
public class TimeConcreteSubject implements TimeSubject {
    private ArrayList observers;
    private int hour;
    private int minute;
    private int second;

    public TimeConcreteSubject() {
        observers = new ArrayList();
    }

    public void registerObserver(TimeObserver to) {
        observers.add(to);
    }

    public void removeObserver(TimeObserver to) {
        observers.remove(to);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); ++i) {
            TimeObserver to = (TimeObserver) observers.get(i);
            to.update(hour, minute, second);
        }
    }

    public void timeChange(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        notifyObservers();
    }
}
