package generics;

/**
 * Created by wwh on 16-3-23.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }

    public Holder3() {

    }

    public void set(T a) {
        this.a = a;
    }
    public T get() {
        return a;
    }
    public static void main(String [] args) {
        Holder3<Integer> i = new Holder3<Integer>();
    }

}
