package ru.mirea.pr9_10;

import java.util.Random;


public class Manager extends Employee implements EmployeePosition{
    private String position = "Manager";

    public Manager(double baseSalary){
        this.baseSalary = baseSalary;
    };
    public Manager(String name, String surname, double baseSalary){
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
    }

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        if (salary == 0){
            Random rand = new Random();
            salary = baseSalary+(rand.nextInt(25)+115)*50;
        }
        return salary;
    }

}
