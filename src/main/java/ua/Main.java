package ua;

import ua.oop.Car;
import ua.oop.Circle;
import ua.oop.CountClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please write your Radious");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = reader.readLine();
        int changeType = Integer.parseInt(readLine);

        Circle cicrle = new Circle();
        System.out.println("Your Square = " + cicrle.Square(changeType));

        CountClasses CountClasses1 = new CountClasses();
        CountClasses CountClasses2 = new CountClasses();
        CountClasses CountClasses3 = new CountClasses();
        System.out.println("so many objects have been created: ");
        CountClasses3.getCountClass();

        System.out.println("Please write your Speed: ");
        String speedLine = reader.readLine();
        int speed = Integer.parseInt(speedLine);

        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.moveCar();
        car.cruiseControl(speed);
    }
}
