package model;

public class Watch {
    String color;
    String brand;
    String movement;
    String model;
    String strapmaterial;
    String casematerial;
    String caseshape;
    double price;
    int makeyear;
    String casesize;

    public Watch(String brand, String model, String casesize, String color, int year) {
        this.brand = brand;
        this.casesize = casesize;
        this.color = color;
        this.makeyear = year;
        this.model = model;
        System.out.println("Watch: " + brand);
    }

    public String toString(){
        return "Watch: " + brand + " " + model + " " + casesize + " " + color + " " + makeyear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
