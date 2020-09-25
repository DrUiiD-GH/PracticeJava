package ru.mirea.pr7;
import java.math.*;

public class Plate extends Dish {
    private int deep;
    private int outerRadius;
    private int innerRadius;
    private int volume;



    public Plate(int deep, int outerRadius, int innerRadius){
        this.deep = deep;
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }

    @Override
    public void calcVolume() {
        volume = deep*innerRadius*innerRadius*(int)Math.PI;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "deep=" + deep +
                ", outerRadius=" + outerRadius +
                ", innerRadius=" + innerRadius +
                ", volume=" + volume +
                '}';
    }
}
