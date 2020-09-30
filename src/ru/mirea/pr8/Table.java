package ru.mirea.pr8;

public class Table extends Furniture {
    int area;
    String material;

    public  Table(int a, int b, String material, int price, boolean stateBuy){
        area = a*b;
        this.material = material;
        this.price = price;
        this.stateBuy = stateBuy;
    }

    @Override
    public String toString() {
        return ("Table:{area: "+area+", material: "+material+", price: "+price+", stateBuy: "+stateBuy+"};");
    }
}
