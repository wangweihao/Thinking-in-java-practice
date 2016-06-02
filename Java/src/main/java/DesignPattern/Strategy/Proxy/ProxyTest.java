package DesignPattern.Strategy.Proxy;

/**
 * Created by wwh on 16-6-2.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Star star = new Star();
        ProxyPeoson proxyPeoson = new ProxyPeoson(star);
        star.setName("Tom");
        star.setInteresters("basketball");
        star.setAge(32);
        star.setHeight(174);

        System.out.println("Star Name:" + proxyPeoson.getName());
        System.out.println("Star Age:" + proxyPeoson.getAge());
        System.out.println("Star Height:" + proxyPeoson.getHeight());
        System.out.println("Star Intersters:" + proxyPeoson.getInteresters());
    }
}
