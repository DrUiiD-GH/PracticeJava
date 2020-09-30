package ru.mirea.pr8;

public class Chair extends Furniture {
    protected String color;
    protected String material;

    public Chair(String color, String material, int price, boolean stateBuy){
        this.color = color;
        this.material = material;
        this.price = price;
        this.stateBuy = stateBuy;
    }

    @Override
    public String toString() {
        return ("Chair: {color: "+color+", material: "+material+", price: "+price+", stateBuy: "+stateBuy+"};" );
    }
}
