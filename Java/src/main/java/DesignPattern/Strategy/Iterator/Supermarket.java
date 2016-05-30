package DesignPattern.Strategy.Iterator;

import java.util.Iterator;

/**
 * Created by wwh on 16-5-30.
 */
public class Supermarket {
    FruitSupermarket fruitSupermarket;
    SnacksSupermarket snacksSupermarket;

    public Supermarket() {
        fruitSupermarket = new FruitSupermarket();
        snacksSupermarket = new SnacksSupermarket();
    }

/*    public void printMenu() {
        ArrayList fruitItems = fruitSupermarket.getMenuItems();
        Item[] snacksItems = snacksSupermarket.getMenuItems();

        System.out.println("fruitItem:");
        for (int i = 0; i < fruitItems.size(); ++i) {
            Item item = (Item) fruitItems.get(i);
            System.out.print("name:" + item.getName());
            System.out.print(" description:" + item.getDescription());
            System.out.println(" price:" + item.getPrice());
        }

        System.out.println("\nsnacksItem:");
        for (int i = 0; i < snacksSupermarket.getNumberOfItems(); ++i) {
            Item item = snacksItems[i];
            System.out.print("name:" + item.getName());
            System.out.print(" description:" + item.getDescription());
            System.out.println(" price:" + item.getPrice());
        }
    }
*/

    public void printMenu() {
        Iterator fruitIterator = fruitSupermarket.createIterator();
        Iterator snacksIterator = snacksSupermarket.createIterator();

        System.out.println("FruitSupermarket");
        printMenu(fruitIterator);
        System.out.println("\nSnacksSupermarket");
        printMenu(snacksIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            System.out.print("name:" + item.getName());
            System.out.print(" description:" + item.getDescription());
            System.out.println(" price:" + item.getPrice());
        }
    }

    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        supermarket.printMenu();
    }
}
