package ru.mirea.pr6;
import ru.mirea.pr5. *;


public class Main {
    public static void main(String args[]){
        MovableRectangle newRec = new MovableRectangle(0, 0, 10, 5);
        System.out.println(newRec.toString());
        newRec.move(5, 5);
        System.out.println(newRec.toString());
    }
}
