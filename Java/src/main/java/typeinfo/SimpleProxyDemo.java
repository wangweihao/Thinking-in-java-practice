package typeinfo;

/**
 * Created by wwh on 16-3-21.
 */

interface Interface {
    void dosomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void dosomething() {
        System.out.println("doSomething");
    }

    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void dosomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.dosomething();
    }
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.dosomething();
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.dosomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String [] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

