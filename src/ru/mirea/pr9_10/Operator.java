package ru.mirea.pr9_10;

import java.util.Random;

public class Operator extends Employee implements EmployeePosition {
    private String position = "Operator";

    public Operator(double baseSalary){
        this.baseSalary = baseSalary;
    };
    public Operator(String name, String surname, double baseSalary){
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
    };



    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        return salary=baseSalary;
    }
}
