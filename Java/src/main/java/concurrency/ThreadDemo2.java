package concurrency;

/**
 * Created by wwh on 16-3-24.
 */

class MyThread2 implements Runnable {
    private int ticket = 5;

    public void run() {
        for (int i = 0; i < 10; ++i) {
            if (ticket > 0) {
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 my = new MyThread2();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
