package org.example;

public class Main {
    public static void main(String[]args) {
        Vehicle vehicle1 = new Vehicle(4, "black", 6, "gas");
        Car car2 = new Car(6, "yellow", 8, "diesel", "Mack");

        System.out.println("Car2 Info");
        car2.displayInfo();
        car2.honk();

        System.out.println("Vehicles1 Info");
        vehicle1.displayInfo();
    }
}
