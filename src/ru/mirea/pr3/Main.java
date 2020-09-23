package ru.mirea.pr3;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(12);
        System.out.println(circle.toString());

        Human man = new Human();
        System.out.println(man.toString());

    }
}

