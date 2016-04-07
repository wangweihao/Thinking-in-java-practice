package concurrency;

/**
 * Created by wwh on 16-4-7.
 */
public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            return;
        } finally {
            System.out.println("finally");
        }
    }
}
