package ru.mirea.pr8;

public abstract class Furniture {

    protected int price;
    protected boolean stateBuy;

    public void setPrice(int price){
        this.price = price;
    };
    public int getPrice(){
        return price;
    };

    public void setStateBuy(boolean state){
        stateBuy = state;
    };
    public boolean getStateBuy(){
        return stateBuy;
    };

    public abstract String toString();
}
