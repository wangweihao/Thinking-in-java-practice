package DesignPattern.Strategy.Proxy;

/**
 * Created by wwh on 16-6-2.
 */
public class Star implements PersonBean {
    private String name;
    private String interesters;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public String getInteresters() {
        return interesters;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInteresters(String interesters) {
        this.interesters = interesters;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
