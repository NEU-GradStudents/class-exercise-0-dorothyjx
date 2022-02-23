package model;

public class Phone {
    String brand;
    String model;
    double price;
    String color;
    int capacity;
    double screensize;
    int cameranum;
    String displaytype;
    String seriesid;

    public Phone(String brand, String model, String color, int capacity, double screensize, String seriesid) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.screensize = screensize;
        this.seriesid = seriesid;
        System.out.println("Phone: " + seriesid);
    }

    public String toString() {
        return "Phone: " + brand + " " + model + " " + color + " " + capacity + " G " + screensize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
