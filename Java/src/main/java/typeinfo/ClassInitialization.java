package typeinfo;

import java.util.Random;

/**
 * Created by wwh on 16-3-21.
 */

class Initable {
    static final int staticfinal = 47;
    static final int staticfinal2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}


public class ClassInitialization {
    public static Random rand = new Random(47);
    public static void main(String[] args) {
        Class initable = Initable.class;
        System.out.println();
    }
}
