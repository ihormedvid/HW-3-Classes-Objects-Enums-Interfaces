import OOP.Car;
import OOP.Circle;
import OOP.Figure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please write your Radious");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = reader.readLine();
        int changeType = Integer.parseInt(readLine);

        Circle cicrle = new Circle();
        System.out.println("Your Square = " + cicrle.Square(changeType));

        System.out.println("Please write your Speed: ");
        String speedLine = reader.readLine();
        int speed = Integer.parseInt(speedLine);

        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.cruiseControl(speed);
    }
}
