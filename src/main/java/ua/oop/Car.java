package ua.oop;

public class Car {
    private int speed;

    public void setSpeed(int speed) {
        if(this.speed >= 0){
            this.speed = speed;
        }
    }

    public void startCar() {
        System.out.println("Your Car is Start");
    }

    public void stopCar() {
        System.out.println("Your Car is stopped");
    }

    public void moveCar(){
        System.out.println("Your car is moving");
    }

    public void cruiseControl(int speed) {
        if(speed > 0) {
            System.out.println("Your сurrent is: " + speed);
        } else {
            stopCar();
        }
    }
}
