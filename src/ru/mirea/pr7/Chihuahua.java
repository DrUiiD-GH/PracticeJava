package ru.mirea.pr7;

public class Chihuahua extends Dog {
   int age;
   String name;



   public Chihuahua(int age, String name){
       this.age = age;
       this.name = name;
    }


    @Override
    public void bark() {
        System.out.println("Tyf, tyf!");
    }

    @Override
    public String toString() {
        return "Chihuahua{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
