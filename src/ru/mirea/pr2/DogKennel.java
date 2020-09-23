package ru.mirea.pr2;

import java.util.Scanner;

public class DogKennel {

    private Dog arrayDoges[] = new Dog[3];

    public void addDog(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<arrayDoges.length; i++ ){
            System.out.print("Введите кличку собаки: ");
            arrayDoges[i].setName(scan.nextLine());
            System.out.print("Введите возраст собаки: ");
            arrayDoges[i].setAge(scan.nextInt());
            arrayDoges[i].conversion();
        }
    }
    public void allDoges(){
        for(int i=0; i<arrayDoges.length; i++ ) {
            System.out.println(arrayDoges[i].getName()+" "+arrayDoges[i].getAge()+";");
        }
    }

}
