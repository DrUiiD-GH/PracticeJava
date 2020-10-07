package ru.mirea.pr9_10;



public class TopManager extends Employee implements EmployeePosition {
    private String position = "TopManager";
    private double incomeCompany;

    public TopManager(double baseSalary, double incomeCompany){
        this.baseSalary = baseSalary;
        this.incomeCompany = incomeCompany;
    };
    public TopManager(String name, String surname, double baseSalary){
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
        if (salary == 0){
            if(incomeCompany>10)
            salary = baseSalary*1.5;
            else salary = baseSalary;
        }
        return salary;
    }
}
