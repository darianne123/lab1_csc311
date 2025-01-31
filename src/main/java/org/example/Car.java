package org.example;

public class Car extends Vehicle{
    /// additional attributes
    public String brand;

    /// calling super to use Vehicles attributes and then adding it to the new Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    /// creating getter and setter for new attribute
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand =brand;
    }

    /// creating honk method
    public void honk(){
        System.out.println("Honk, honk!");
    }

    //creating method that prints all the attributes
    public void displayInfo(){
        System.out.println("Number of Wheels : " + getNumberOfWheels());
        System.out.println("Color: " + getColor() );
        System.out.println("Engine Size : " + getEngineSize());
        System.out.println("Fuel Type : " + getFuelType());
    }


}
