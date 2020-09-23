package ru.mirea.pr1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ////////////////////// TASK 3 //////////////////////////
        System.out.println("--------------- Задание 3 ---------------");
        int [] Array = {1, 21, 41, 5, 1, 63, 6};

        System.out.println("Цикл for:");
        int summ = 0;
        for (int i=0; i<Array.length-1; i++){
            summ +=Array[i];
        }
        System.out.println(summ);

        System.out.println("Цикл while:");
        summ=0;
        int I=0;
        while(I<Array.length-1){
            summ+=Array[I++];
        }
        System.out.println(summ);

        System.out.println("Цикл do while:");
        summ=0;
        I=0;
        do{
            summ+=Array[I++];
        }while (I<Array.length-1);
        System.out.println(summ);


        ////////////////////// TASK 4 //////////////////////////
        System.out.println("--------------- Задание 4 ---------------");
        for (int i=0; i<args.length-1; i++){
            System.out.println(args);
        }
        //Нет аргументов на входе(


        ////////////////////// TASK 5 //////////////////////////
        System.out.println("--------------- Задание 5 ---------------");
        for (int i=1; i<11; i++){
            System.out.printf( "%.3f", 1f/i);
            System.out.println();
        }

        ////////////////////// TASK 6 //////////////////////////
        System.out.println("--------------- Задание 6 ---------------");
        int []myArray = new int[10];

        System.out.println("Генерация с помощью метода random() класса Math:");
        for(int i=0; i<10; i++){
            myArray[i] = (int)(Math.random()*100);
            System.out.print(myArray[i]+" ");
        }
        System.out.println();

        myArray=ArraySort(myArray);
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.println();



        System.out.println("Генерация с помощью метода nextInt() класса Random:");
        Random random = new Random();
        for(int i=0; i<10; i++){
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i]+" ");
        }
        System.out.println();

        myArray=ArraySort(myArray);
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.println();

        ////////////////////// TASK 7 //////////////////////////
        System.out.println("--------------- Задание 6 ---------------");
        System.out.println("Введите число, факториал которого хотите найти: ");
        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Факториал числа "+number+" равен "+ Factorial(number));
    }

    // Сортировка простым обменом с условием Айверсона для задания 6
    public static int[] ArraySort(int myArray[]){
        boolean flag = false;
        while (flag == false){
            flag=true;
            for (int i=0; i<myArray.length-1; i++){
                if (myArray[i]>myArray[i+1]){
                    flag=false;
                    int buf = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = buf;
                }
            }
        }
        return myArray;
    };


    //Функция, вычисляющая факториал числа для задания 7
    public static int Factorial(int myNum){
        int sum = 1;
        for (int i=1; i<=myNum; i++){
            sum*=i;
        }
        return sum;
    }

}

