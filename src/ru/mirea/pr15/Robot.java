package ru.mirea.pr15;

public class Robot {
    LeftLeg lLeg;
    RightLeg rLeg;

    public Robot(){
        lLeg = new LeftLeg();
        rLeg = new RightLeg();
    }
    public void go(){
        lLeg.start();
        rLeg.start();
    }
}
