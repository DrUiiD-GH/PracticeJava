package ru.mirea.pr21_22.Chairs;

public class MagicChairFactory implements Factory {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}