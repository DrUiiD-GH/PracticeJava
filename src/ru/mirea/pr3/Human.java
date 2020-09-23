package ru.mirea.pr3;

import java.util.Scanner;

public class Human {
    private String gender;
    private int height;
    private int weight;

    private Head hasHead;
    private Hand hasHands;
    private Leg hasLegs;


    public Human(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter gender, height, weight, is has Hands?(true/false), is has Legs?(true/false), is has Head?(true/false)");
        gender = scanner.nextLine();
        height = scanner.nextInt();
        weight = scanner.nextInt();

        hasHead = new Head(scanner.nextBoolean());
        hasHands = new Hand(scanner.nextBoolean());
        hasLegs = new Leg(scanner.nextBoolean());

    }

    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hasHead=" + hasHead.returnAvailable() +
                ", hasHands=" + hasHands.returnAvailable() +
                ", hasLegs=" + hasLegs.returnAvailable() +
                '}';
    }
}

