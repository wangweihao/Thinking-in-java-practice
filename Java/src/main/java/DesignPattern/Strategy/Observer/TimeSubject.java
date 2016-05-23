package DesignPattern.Strategy.Observer;

/**
 * Created by wwh on 16-5-23.
 */
public interface TimeSubject {
    public void registerObserver(TimeObserver to);
    public void removeObserver(TimeObserver to);
    public void notifyObservers();
}
