package ru.mirea.pr9_10;

public abstract class Employee implements EmployeePosition{
    protected String name;
    protected String surname;
    protected double baseSalary;
    protected double salary = 0;
    protected String position;

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", baseSalary=" + baseSalary +
                ", salary=" + calcSalary() +
                ", position='" + getJobTitle() + '\'' +
                '}';
    }
}
