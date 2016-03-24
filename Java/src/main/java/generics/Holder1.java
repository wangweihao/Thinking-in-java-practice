package generics;

/**
 * Created by wwh on 16-3-24.
 */

class Automobile {}

public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) {
        this.a = a;
    }
    Automobile get() {
        return a;
    }
}
