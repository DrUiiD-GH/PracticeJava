package ru.mirea.pr3;

public class Leg {
    private boolean isAvailable;

    public Leg(boolean is){
        isAvailable = is;
    };
    public boolean returnAvailable(){
        return isAvailable;
    }

}
