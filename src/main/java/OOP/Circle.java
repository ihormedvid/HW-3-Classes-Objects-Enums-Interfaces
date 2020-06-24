package OOP;

public class Circle extends Figure{
    private int radious;
    final static double PI = Math.PI;
    private double resut;

    public double getResut() {
        return resut;
    }

    @Override
    public void setRadious(int radious) {
        if(this.radious > 0){
            this.radious = radious;
        }
    }

    @Override
    public int getRadious() {
        return radious;
    }

    @Override
    public double Square(int radious) {
        return resut = 2 * PI * radious;
    }
}
