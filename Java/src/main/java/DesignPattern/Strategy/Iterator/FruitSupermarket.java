package DesignPattern.Strategy.Iterator;

import java.util.*;

/**
 * Created by wwh on 16-5-30.
 */
public class FruitSupermarket {
    ArrayList menuItems;

    public FruitSupermarket() {
        menuItems = new ArrayList();

        addItem("苹果", "红色的", 1.99);
        addItem("香蕉", "黄色的", 2.00);
        addItem("橙子", "横色的", 3.12);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public void addItem(String name, String description, double price) {
        Item item = new Item(name, description, price);
        menuItems.add(item);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
