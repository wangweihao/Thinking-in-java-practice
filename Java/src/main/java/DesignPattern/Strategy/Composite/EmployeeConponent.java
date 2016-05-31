package DesignPattern.Strategy.Composite;

/**
 * Created by wwh on 16-5-31.
 */
public abstract class EmployeeConponent {
    private String name;
    private String description;
    private double salary;

    public EmployeeConponent(String name, String description, double salary) {
        this.name = name;
        this.description = description;
        this.salary = salary;
    }

    public void add(EmployeeConponent employeeConponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(EmployeeConponent employeeConponent) {
        throw new UnsupportedOperationException();
    }

    public Object getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.print("name:" + name);
        System.out.print(" description:" + description);
        System.out.println(" salary:" + salary);
    }
}
