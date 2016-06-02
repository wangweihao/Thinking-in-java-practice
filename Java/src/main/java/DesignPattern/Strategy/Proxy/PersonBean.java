package DesignPattern.Strategy.Proxy;

/**
 * Created by wwh on 16-6-2.
 */
public interface PersonBean {
    String getName();
    String getInteresters();
    int getAge();
    double getHeight();

    void setName(String name);
    void setInteresters(String interesters);
    void setAge(int age);
    void setHeight(int height);
}
