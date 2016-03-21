package typeinfo;

/**
 * Created by wwh on 16-3-21.
 */

class Base {}

class Derived extends Base{}

public class InstanceofAndClass {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println((b instanceof Base));
        System.out.println((d instanceof Base));
        System.out.println((b.getClass() == Base.class));
        //System.out.println((d.getClass() == Base.class));
    }
}
