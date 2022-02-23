package model;

public class Laptop {
    String model;
    String make;
    int year;
    String color;
    double price;
    String storage;
    int screensize;
    String memory;
    String seriesid;

    public Laptop(String model, String make, int sz, int year, String seriesid) {
        this.model = model;
        this.make = make;
        this.screensize = sz;
        this.year = year;
        this.seriesid = seriesid;
        System.out.println("Laptop: " + seriesid);
    }

    public String toString(){
        return "Laptop:" + make + " " + model + " " + screensize + ", " + year;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
