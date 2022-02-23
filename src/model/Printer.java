package model;

import javax.swing.plaf.synth.SynthUI;

public class Printer {
    String brand;
    String productid;
    String color;
    String model;
    double price;
    int makeyear;
    boolean isSupportColor;
    boolean isSuuportScan;

    public Printer(String brand, String model, String color, boolean iscolor, boolean scan) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isSupportColor = iscolor;
        this.isSuuportScan = scan;
        System.out.println("Printer: " + brand + " " + model);
    }

    public String toString() {
        if(isSuuportScan == true && isSuuportScan == true) {
            return "Printer: " + brand + " " + model + " " + color + " " + makeyear + "Supporting both Scanning and Color Printing";
        } else if (isSuuportScan == true) {
            return "Printer: " + brand + " " + model + " " + color + " " + makeyear + "Supporting Scanning";
        }else if(isSupportColor == true){
            return "Printer: " + brand + " " + model + " " + color + " " + makeyear + "Supporting Color Printing";
        } else {
            return "Printer: " + brand + " " + model + " " + color + " " + makeyear;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
