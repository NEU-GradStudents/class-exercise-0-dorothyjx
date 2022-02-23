package model;

public class Book {
    String name;
    String author;
    int year;
    String country;
    String color;
    int totalPages;
    int chapters;
    double price;

    //constructor
    public Book(String bookName, String author, double price) {
        this.author = author;
        this.name = bookName;
        this.price = price;
        System.out.println("Book Name: " + name);
    }

    public String toString(){
        return "Book: " + name + ", Author: " + author + ", $" + price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
