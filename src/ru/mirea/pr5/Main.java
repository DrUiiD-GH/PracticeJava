package ru.mirea.pr5;

public class Main {
    public static void main(String args[]) {
        MovablePoint newPoint = new MovablePoint(10, 12);
        System.out.println(newPoint.toString());
        newPoint.move(5, 5);
        System.out.println(newPoint.toString());


        MovableCircle newCircle= new MovableCircle(5, 10, 3);
        System.out.println(newCircle.toString());
        newCircle.move(10, -5);
        System.out.println(newCircle.toString());
    }
}
