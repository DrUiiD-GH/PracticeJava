package ru.mirea.pr21_22.Chairs;

public class MultyfunctionChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}