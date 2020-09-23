package ru.mirea.pr5;

public class Circle {
    private Point center;
    private int radios;

    public Circle(int x, int y, int radios) {
        center = new Point(x, y);
        this.radios = radios;
    }

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center){
        this.center=center;
    }

    public int getRadios() {
        return radios;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radios=" + radios +
                '}';
    }
}
