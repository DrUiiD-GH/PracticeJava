package ru.mirea.pr2;

public class Dog {
    private String name;
    private int age;
    private int humanAge;

    public Dog(String newName, int newAge){
        name = newName;
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public int getAge() {
        return age;
    }

    public void conversion(){
        humanAge = age/7;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", humanAge=" + humanAge +
                '}';
    }
}
