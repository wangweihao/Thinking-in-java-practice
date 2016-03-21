package typeinfo;

import typeinfo.interfacea.A;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by wwh on 16-3-21.
 */

class InnnerA {
    private static class C implements A {
        public void f() {
            System.out.println("public C.f()");
        }
        public void g() {
            System.out.println("public C.g()");
        }
        void u(){
            System.out.println("package C.u()");
        }
        protected void v() {
            System.out.println("protected C.v()");
        }
        private void w() {
            System.out.println("private C.w()");
        }
    }
    public static A makeA() { return new C(); }
}

public class InnerImplementation  {
    public static void main(String [] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = InnnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImlementation.callHiddenMethod(a, "g");
        HiddenImlementation.callHiddenMethod(a, "u");
        HiddenImlementation.callHiddenMethod(a, "v");
        HiddenImlementation.callHiddenMethod(a, "w");
    }
}
