package ru.mirea.pr7;

public class Main {
    public static void main(String args[]){
        Cup redBigCup = new Cup(5, 3, "red");
        redBigCup.calcVolume();
        System.out.println(redBigCup.toString());

        Plate smallPlate = new Plate(2, 7, 6);
        smallPlate.calcVolume();
        System.out.println(smallPlate.toString());

        GermanShepherd bigDog = new GermanShepherd(90, 70, 12);
        bigDog.bark();
        bigDog.bark();
        System.out.println(bigDog.toString());

        Chihuahua littleDog = new Chihuahua(2, "Pusy");
        littleDog.bark();
        littleDog.bark();
        System.out.println(littleDog.toString());
    }
}
