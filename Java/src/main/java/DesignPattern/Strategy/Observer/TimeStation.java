package DesignPattern.Strategy.Observer;

/**
 * Created by wwh on 16-5-23.
 */
public class TimeStation {
    public static void main(String []args) {
        TimeConcreteSubject timeConcreteSubject = new TimeConcreteSubject();
        TimeConcreteObserver timeConcreteObserver = new TimeConcreteObserver(timeConcreteSubject);

        timeConcreteSubject.timeChange(10, 50, 29);
        timeConcreteObserver.display();
    }
}
