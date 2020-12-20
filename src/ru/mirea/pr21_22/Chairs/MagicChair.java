package ru.mirea.pr21_22.Chairs;

public class MagicChair implements Chair{
    public MagicChair() {
        System.out.println("Магический стул у вас)");
    }

    @Override
    public void sit() {
        System.out.println("Вы сели на магический стул");
    }
}