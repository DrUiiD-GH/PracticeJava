package ru.mirea.pr21_22.Numbers;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumberInterface number;
        ComplexNumberFactory creating = new Create();
        number = creating.create();
    }
}

