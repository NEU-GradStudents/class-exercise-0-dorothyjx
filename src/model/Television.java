package model;

public class Television {
    String brand;
    String productID;
    String series;
    double price;
    int makeyear;
    int size;
    String resolution;
    String displaytype;

    public Television(String brand, String series, int size, String resolution, String displaytype, int makeyear){
        this.brand = brand;
        this.series = series;
        this.size = size;
        this.resolution = resolution;
        this.displaytype = displaytype;
        this.makeyear = makeyear;
        System.out.println("TV: " + brand + " " + series);

    }

    public String toString(){
        return "TV: " + brand + " " + series + " " + resolution + " " + displaytype + " " + size + " inches " + makeyear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
