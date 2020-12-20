package ru.mirea.pr21_22.Numbers;

public class Create implements ComplexNumberFactory{
    @Override
    public ComplexNumber create() {
        double re = 3;
        double im = 2;
        return new ComplexNumber(re,im);
    }
}
