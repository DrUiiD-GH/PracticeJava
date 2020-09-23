package ru.mirea.pr5;

public class MovableCircle extends Circle implements Movable {
    public MovableCircle(int x, int y, int radios) {
        super(x, y, radios);
    }

    @Override
    public void move(int x, int y) {
        this.setCenter(new Point(this.getCenter().getX() + x,
        this.getCenter().getY() + y));
    }
}
