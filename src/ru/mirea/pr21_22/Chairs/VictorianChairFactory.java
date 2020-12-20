package ru.mirea.pr21_22.Chairs;

public class VictorianChairFactory implements Factory {


    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}