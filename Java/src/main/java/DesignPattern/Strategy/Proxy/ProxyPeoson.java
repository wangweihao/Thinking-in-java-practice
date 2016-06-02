package DesignPattern.Strategy.Proxy;

/**
 * Created by wwh on 16-6-2.
 */
public class ProxyPeoson implements PersonBean{
    private PersonBean star;

    public ProxyPeoson(PersonBean star) {
        this.star = star;
    }

    public String getName() {
        return star.getName();
    }

    public String getInteresters() {
        return star.getInteresters();
    }

    public int getAge() {
        return star.getAge()-5;
    }

    public double getHeight() {
        return star.getHeight()+10;
    }

    public void setName(String name) {
        star.setName(name);
    }

    public void setInteresters(String interesters) {
        star.setInteresters(interesters);
    }

    public void setAge(int age) {
        star.setAge(age);
    }

    public void setHeight(int height) {
        star.setHeight(height);
    }
}
