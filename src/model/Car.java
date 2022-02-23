package model;

public class Car {
    String make;
    String model;
    String color;
    int capacity;
    String fueltype;
    String vin;
    int year;
    int numoftires;

    public Car(String make, String model, int year, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        System.out.println("Car VIN: " + vin);
    }

    public String toString() {
        return "Car: " + make + " " + year + " " + model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
