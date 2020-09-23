package ru.mirea.pr2;

public class Shape {
    private int corners;
    private String color;

    public Shape(int corners1, String color1){
        corners=corners1;
        color = color1;
    }

    public String toString(){
        return ("Shape:"+"\nCorners = "+corners+"\nColor = "+color);
    }
}

