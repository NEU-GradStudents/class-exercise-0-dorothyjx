package model;

public class Perfume {
    String brand;
    String name;
    String genderperferance;
    double price;
    int size;
    String tastes;
    String ingredients;
    boolean isSet;

    public Perfume(String brand, String name, int size, String genderperferance) {
        this.brand = brand;
        this.name = name;
        this.genderperferance = genderperferance;
        this.size = size;
        System.out.println("Perfume: " + name);
    }

    public String toString() {
        return "Perfume: " + brand + " " + name + " " + genderperferance + " perfume " + size + "ml";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
