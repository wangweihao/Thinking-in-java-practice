package DesignPattern.Strategy.TemplateMethod;

/**
 * Created by wwh on 16-5-30.
 */
public class Drink {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Coffee..");
        coffee.prepareRecipe();

        Tea tea = new Tea();
        System.out.println("\nTea...");
        tea.prepareRecipe();
    }
}
