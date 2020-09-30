package ru.mirea.pr8;

public class Sofa extends Furniture{

    int length;
    int with;
    String material;


    public Sofa(int length, int with, String material, int price, boolean stateBuy){
        this.length = length;
        this.with = with;
        this.material = material;
        this.price = price;
        this.stateBuy = stateBuy;
    }

    @Override
    public String toString() {
        return ("Sofa:{length: "+length+", with: "+with+", material: "+material+", price: "+price+", stateBuy: "+stateBuy+"};");
    }
}
