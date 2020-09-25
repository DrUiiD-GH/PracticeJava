package ru.mirea.pr7;

public class GermanShepherd extends Dog{
    int height;
    int weight;
    int age;

    public GermanShepherd(int height, int weight, int age){
        this.height = height;
        this.weight = weight;
        this.age = age;
    }


    @Override
    public void bark() {
        System.out.println("Ouf, ouf!");
    }

    @Override
    public String toString() {
        return "GermanShepherd{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
