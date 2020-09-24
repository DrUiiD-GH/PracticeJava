package ru.mirea.pr6;

import ru.mirea.pr5. *;

public class MovableRectangle extends Rectangle implements Movable {

    public MovableRectangle(int leftDownPointX, int leftDownPointY, int rightTopPointX, int rightTopPointY) {
        super(leftDownPointX, leftDownPointY, rightTopPointX, rightTopPointY);
    }

    @Override
    public void move(int x, int y) {
        setLeftDownPoint(new Point(getLeftDownPoint().getX()+x, getLeftDownPoint().getY()+y));
        setRightTopPoint(new Point(getRightTopPoint().getX()+x, getRightTopPoint().getY()+y));
    }
}
