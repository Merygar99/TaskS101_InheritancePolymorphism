package level1.exercise2.model;

public class Car {
    public static final String brand = "Nissan";
    public static String model;
    public final int power;

    public Car(int power) {
        this.power = power;
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }
}
