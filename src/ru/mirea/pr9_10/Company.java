package ru.mirea.pr9_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Company implements Comparator<Employee> {
    Scanner scan = new Scanner(System.in);
    Random random= new Random();

    private ArrayList<Employee> listStaff;
    private double income;


    public Company(double income){
        this.income = income;
        listStaff = new ArrayList<Employee>();
    }

    public void hire(){


        int choose;
        String name;
        String surname;

        System.out.print("Choose position (1.TopManager/2.Manager/3.Operator): ");
        do{
            choose = scan.nextInt();
        }while (choose>3&&choose<1);

        scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scan.nextLine();

        scan = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = scan.nextLine();


        switch (choose){
            case 1:
                listStaff.add(new TopManager(name, surname, (random.nextInt(25)+90)*1000));
                break;
            case 2:
                listStaff.add(new Manager(name, surname, (random.nextInt(25)+70)*1000));
                break;
            case 3:
                listStaff.add(new Operator(name, surname, (random.nextInt(15)+40)*1000));
                break;
        }

        System.out.println(listStaff.get(0).toString());
    }

    public void hireAll(int iCountOperator, int iCountManager, int iCountTopManager){
        for (int i=0; i<iCountOperator; i++){
            listStaff.add(new Operator((random.nextInt(15)+40)*1000));
        }
        for (int i=0; i<iCountManager; i++){
            listStaff.add(new Manager((random.nextInt(25)+70)*1000));
        }
        for (int i=0; i<iCountTopManager; i++){
            listStaff.add(new TopManager((random.nextInt(25)+90)*1000, income));
        }
    }

    public void fire (){
        int choose;

        showListStuff(listStaff);
        System.out.print("Select an employee to be fired (0-"+(listStaff.size()-1)+"): ");
        do{
            choose = scan.nextInt();
        }while(choose<0&&choose>listStaff.size()-1);
        System.out.println(listStaff.get(choose).getJobTitle()+" with salary "+listStaff.get(choose).calcSalary()+" has been fired.");
        listStaff.remove(choose);
    }

    public void showListStuff(ArrayList<Employee> list){
        for (int i=0; i<list.size(); i++) {
            System.out.println(i+". "+list.get(i).getJobTitle()+" "+list.get(i).calcSalary()+" rub;");
        }
    }


    ArrayList getTopSalaryStaff(int count){
        return new ArrayList();
    };
    ArrayList getLowestSalaryStaff(int count){
        return new ArrayList();
    };

    @Override
    public int compare(Employee employee, Employee t1) {
        return (int)employee.getSalary();
    }

}
