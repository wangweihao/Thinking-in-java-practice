package typeinfo;

import typeinfo.interfacea.A;

/**
 * Created by wwh on 16-3-21.
 */
class B implements A {
    public void f() {}
    public void g() {}
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        if(a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
