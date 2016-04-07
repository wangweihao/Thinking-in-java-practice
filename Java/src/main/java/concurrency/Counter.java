package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wwh on 16-4-7.
 */
public class Counter implements Runnable {
    private static int counter = 0;
    public static int getCounter() {
        return counter;
    }
    public synchronized void run() {
        for (int i = 0; i < 1000000; ++i) {
            counter++;
        }
    }
    public static void test(int n) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < n; ++i) {
            executorService.execute(new Counter());
        }
        executorService.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter.test(10);
        System.out.println(Counter.getCounter());

    }

}
