package org.example;

public class Vehicle {
    /// adding the attributes
    public int numberOfWheels;
    public String color;
    public float engineSize;
    public String fuelType;

    /// the constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    ///the getter methods
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public String getColor(){
        return color;
    }
    public float getEngineSize(){
        return engineSize;
    }
    public String getFuelType(){
        return fuelType;
    }

    /// the setter methods
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Number of Wheels : " + getNumberOfWheels());
        System.out.println("Color: " + getColor() );
        System.out.println("Engine Size : " + getEngineSize());
        System.out.println("Fuel Type : " + getFuelType());
    }

}
