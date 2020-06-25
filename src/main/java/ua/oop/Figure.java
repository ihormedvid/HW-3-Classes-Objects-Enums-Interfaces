package ua.oop;

abstract public class Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public abstract int getRadious();

    public double Square(int radious){
        return 0;
    }
}
