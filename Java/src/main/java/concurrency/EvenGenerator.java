package concurrency;

/**
 * Created by wwh on 16-4-7.
 */
public class EvenGenerator extends IntGenerator {
    public int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());

    }
}
