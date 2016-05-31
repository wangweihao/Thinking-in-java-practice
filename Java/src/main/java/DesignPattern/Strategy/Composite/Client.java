package DesignPattern.Strategy.Composite;

/**
 * Created by wwh on 16-5-31.
 */
public class Client {
    public static void main(String[] args) {
        Boss CEO = new Boss("Li", "CEO", 25000);

        Employee employee1 = new Employee("Zhang", "Employee", 12000);
        Employee employee2 = new Employee("Zhao", "Employee", 12000);

        Boss manager = new Boss("Wang", "Manager", 20000);

        Employee employee3 = new Employee("He", "Employee", 12000);
        Employee employee4 = new Employee("Qi", "Empoyee", 12000);

        CEO.add(employee1);
        CEO.add(employee2);
        CEO.add(manager);
        manager.add(employee3);
        manager.add(employee4);

        CEO.print();
    }
}
