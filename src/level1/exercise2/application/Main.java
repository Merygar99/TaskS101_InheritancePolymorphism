package level1.exercise2.application;

import level1.exercise2.model.Car;

public class Main {
    public static void main(String[] args) {
        Car.model = "Qashqai";

        Car car1 = new Car(340);

        car1.accelerate();
        Car.brake();

        System.out.println("Brand: " + Car.brand);
        System.out.println("Model: " + Car.model);
        System.out.println("Power: " + car1.power);

    }
}

