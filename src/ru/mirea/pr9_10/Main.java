package ru.mirea.pr9_10;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter income company (millions): ");
        double income= scanner.nextDouble();
        Company BigSmoke = new Company(income);

        System.out.println("How many operators you want in yor company?:");
        int countOperators = scanner.nextInt();
        System.out.println("How many managers you want in yor company?:");
        int countManagers = scanner.nextInt();
        System.out.println("How many TopMangers you want in yor company?:");
        int countTopManagers = scanner.nextInt();
        BigSmoke.hireAll(countOperators, countManagers, countTopManagers);

    }
}
