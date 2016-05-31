package DesignPattern.Strategy.Composite;

import java.util.ArrayList;

/**
 * Created by wwh on 16-5-31.
 */
public class Boss extends EmployeeConponent {
    ArrayList<EmployeeConponent> subordinates;

    public Boss(String name, String description, double salary) {
        super(name, description, salary);
        subordinates = new ArrayList<EmployeeConponent>();
    }

    @Override
    public void add(EmployeeConponent employeeConponent) {
        subordinates.add(employeeConponent);
    }

    @Override
    public void remove(EmployeeConponent employeeConponent) {
        subordinates.remove(employeeConponent);
    }

    @Override
    public EmployeeConponent getChild(int i) {
        return (EmployeeConponent) subordinates.get(i);
    }

    @Override
    public void print() {
        System.out.print("name:" + super.getName());
        System.out.print(" description:" + super.getDescription());
        System.out.println(" salary:" + super.getSalary());
        for (EmployeeConponent i : subordinates) {
            i.print();
        }
        System.out.println();
    }
}
