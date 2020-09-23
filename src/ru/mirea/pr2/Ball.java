package ru.mirea.pr2;

public class Ball{
    private int diameter;
    private String color;

    public Ball(int diameter1, String color1){
        diameter = diameter1;
        color = color1;
    };

    public String toString(){
        return ("Ball:\n" + "Diameter = "+diameter+"\nColor = "+color);
    }
}
