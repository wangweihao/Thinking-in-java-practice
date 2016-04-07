package concurrency;

/**
 * Created by wwh on 16-4-7.
 */
public class SynchronziedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronziedEvenGenerator());
    }
}
