package ru.mirea.pr4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);

        Author aut = new Author(scan.nextLine(), scan.nextLine(), (char)System.in.read());
        System.out.println(aut.toString());
    }
}
