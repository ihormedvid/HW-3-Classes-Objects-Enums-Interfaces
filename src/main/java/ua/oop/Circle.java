package ua.oop;

import static java.lang.Math.PI;

public class Circle extends Figure{
    private int radius;
    private double result;

    public double getResut() {
        return result;
    }

    @Override
    public void setRadius(int radious) {
        if(this.radius > 0){
            this.radius = radius;
        }
    }

    @Override
    public int getRadious() {
        return radius;
    }

    @Override
    public double Square(int radius) {
        return result = 2 * PI * radius;
    }
}
