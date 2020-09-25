package ru.mirea.pr7;

import java.math.*;

public class Cup extends Dish {
    private int deep;
    private int radios;
    private String color;
    private int volume;

    public Cup(int deep, int radios, String color){
        this.deep = deep;
        this.radios = radios;
        this.color = color;
    }

    @Override
    public void calcVolume() {
        volume = (int)Math.PI*radios*radios*deep;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "deep=" + deep +
                ", radios=" + radios +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}
