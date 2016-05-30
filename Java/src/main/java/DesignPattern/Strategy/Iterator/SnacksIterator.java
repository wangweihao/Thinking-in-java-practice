package DesignPattern.Strategy.Iterator;

import java.util.Iterator;

/**
 * Created by wwh on 16-5-30.
 */
public class SnacksIterator implements Iterator {
    Item[] menuItems;
    int position = 0;

    public SnacksIterator(Item[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    public Object next() {
        Item menuitem = menuItems[position];
        position += 1;
        return menuitem;
    }
}
