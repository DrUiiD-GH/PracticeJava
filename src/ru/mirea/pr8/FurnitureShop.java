package ru.mirea.pr8;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    ArrayList<Furniture> catalog;
    public FurnitureShop(){
        catalog = new ArrayList<Furniture>();
        catalog.add(new Chair("yellow", "wood", 34, true));
        catalog.add(new Sofa(250, 70, "leather", 129, true));
        catalog.add(new Table(120, 150, "wood", 59, true));
    }

    public void showCatalog(){
        for(int i=0; i<catalog.size(); i++)
        System.out.println(i+1+": "+catalog.get(i).toString());
    }

    public void buyFurniture() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            showCatalog();
            System.out.println("Choose furniture from the list to buy (Out: <1): ");

            int iNum = 0;
            do {
                iNum = scanner.nextInt()-1;
            } while (iNum >= catalog.size());
            if (iNum < 0) return;
            if (catalog.get(iNum).getStateBuy() == true) {
                catalog.get(iNum).setStateBuy(false);
                System.out.println("You bought!");
            } else {
                System.out.println("Furniture is sold, try different furniture.");
            }
        }

    }
}
