package ru.mirea.pr2;

public class Main {

    public static void main(String[] args) {
        Shape TestShape = new Shape(4, "red");
        System.out.println(TestShape.toString());

        Book newBook = new Book("War and Piece", "Leo Tolstoy", 1274);
        System.out.println(newBook.toString());

        Ball newBall = new Ball(12, "blue");
        System.out.println(newBall.toString());

        DogKennel doges = new DogKennel();
        doges.allDoges();

    }
}

