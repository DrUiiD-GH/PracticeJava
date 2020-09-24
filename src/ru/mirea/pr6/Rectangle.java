package ru.mirea.pr6;

import ru.mirea.pr5.*;

public class Rectangle {
    private Point leftDownPoint;
    private Point rightTopPoint;

    public Rectangle(int leftDownPointX, int leftDownPointY, int rightTopPointX, int rightTopPointY){
        this.leftDownPoint = new Point(leftDownPointX, leftDownPointY);
        this.rightTopPoint = new Point(rightTopPointX, rightTopPointY);
    }


    public Point getLeftDownPoint() {
        return leftDownPoint;
    }

    public Point getRightTopPoint(){
        return rightTopPoint;
    }

    public void setLeftDownPoint(Point leftDownPoint) {
        this.leftDownPoint = leftDownPoint;
    }

    public void setRightTopPoint(Point rightTopPoint) {
        this.rightTopPoint = rightTopPoint;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftDownPoint=" + leftDownPoint +
                ", rightTopPoint=" + rightTopPoint +
                '}';
    }
}
