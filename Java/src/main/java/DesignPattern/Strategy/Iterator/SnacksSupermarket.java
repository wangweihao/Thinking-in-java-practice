package DesignPattern.Strategy.Iterator;

import java.util.Iterator;

/**
 * Created by wwh on 16-5-30.
 */
public class SnacksSupermarket {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Item[] menuItems;

    public SnacksSupermarket() {
        menuItems = new Item[MAX_ITEMS];

        addItem("牛奶", "伊利", 2.24);
        addItem("糖", "阿尔卑斯", 5.12);
        addItem("巧克力", "金蒂", 1.23);
    }

    public Iterator createIterator() {
        return new SnacksIterator(menuItems);
    }

    public void addItem(String name, String description, double price) {
        Item item = new Item(name, description, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("抱歉，清单已满...");
        } else {
            menuItems[numberOfItems] = item;
            numberOfItems += 1;
        }
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public Item[] getMenuItems() {
        return menuItems;
    }
}
