package OOP;

import org.w3c.dom.ls.LSOutput;

public class Car {
    private int speed;

    public void setSpeed(int speed) {
        if(this.speed > 0){
            this.speed = speed;
        }
    }

    public void startCar() {
        System.out.println("Your Car is Start");
    }

    public void stopCar() {
        System.out.println("Your Car is stopped");
    }

    public void cruiseControl(int speed) {
        System.out.println("your Speed : " + speed);
    }
}
