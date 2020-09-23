package ru.mirea.pr3;

public class Circle {
    private int radius;
    private String color;

    public void setRadius(int newRadius){
        radius=newRadius;
    }
    public void setColor(String newColor){
        color=newColor;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
