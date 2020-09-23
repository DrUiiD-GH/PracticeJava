package ru.mirea.pr3;

public class Hand {
    private boolean isAvailable;

    public Hand(boolean is){
        isAvailable = is;
    };
    public boolean returnAvailable(){
        return isAvailable;
    }
}
