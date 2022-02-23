package com.example.exercise0;
import model.*;

public class Exercise0 {

    public static void main(String[] args) {
        System.out.println("====== 1: Book ======");
        Book book1 = new Book("Daily Coding Problem", "Alex Miller & Lawrence Wu", 49.99);
        Book book2 = new Book("Algorithms", "Robert Sedgewick & Kevin Wayne", 129.80);
        Book book3 = new Book("Displine And Punish", "Michel Foucault", 16.95);

        System.out.println("====== 2: Laptop ======");
        Laptop lp1 = new Laptop("MacBook Pro", "Apple", 13, 2020,"1098A2345B");
        Laptop lp2 = new Laptop("Macbook Pro", "Apple", 13, 2017,"1230C4578B");
        Laptop lp3 = new Laptop("MacBook Pro", "Apple", 15, 2020,"9087A5671B");

        System.out.println("====== 3: Student ======");
        Student s1 = new Student("Dorothy Ji");
        Student s2 = new Student("Amy Allen", "Info 5100", "Application Eng");
        Student s3 = new Student("Bob Bond", "Boston");

        System.out.println("====== 4: Phone ======");
        Phone p1 = new Phone("Apple", "iphone 13", "Mint", 128, 6.1, "1234A");
        Phone p2 = new Phone("Apple", "iphone 12", "Mint", 128, 5.4, "1235B");
        Phone p3 = new Phone("Apple", "iphone 13", "Yellow", 256, 6.1, "1257A");


        System.out.println("====== 5: Car ======");
        Car car1 = new Car("Ford", "Fusion", 2014, "123A123B456C654D");
        Car car2 = new Car("Tesla", "Model S", 2014, "124A123B456C554D");
        Car car3 = new Car("Audi", "A3", 2019, "726A123B956F653G");

        System.out.println("====== 6: Dog ======");
        Dog dog1 = new Dog("Border Collie", "Mulan", "Black and White", true);
        Dog dog2 = new Dog("Husky", "Muto", "Black and White", false);
        Dog dog3 = new Dog("Border Collie", "Beta", "Black and White", true);

        System.out.println("====== 7: Perfume ======");
        Perfume per1 = new Perfume("Jo Malone", "Orange Blossom", 30, "Woman");
        Perfume per2 = new Perfume("Jo Malone", "Red Roses", 50, "Woman");
        Perfume per3 = new Perfume("Jo Malone", "Wild Bluebell", 30, "Woman");

        System.out.println("====== 8: Printer ======");
        Printer printer1 = new Printer("HP", "PhotoSmart 6510", "Black", true, true);
        Printer printer2 = new Printer("HP", "DeskJet 3755", "White", true, true);
        Printer printer3 = new Printer("Canon", "PIXMA TS3520", "White",
                true, true);

        System.out.println("====== 9: Watch ======");
        Watch wa1 = new Watch("Coach", "Ruby Watch", "32mm", "Blush", 2021);
        Watch wa2 = new Watch("Apple", "Series 7", "41mm", "Gold", 2020);
        Watch wa3 = new Watch("Daniel Wellington", "Petite Durham", "32mm", "Eggshell White", 2019);

        System.out.println("====== 10: Television ======");
        Television tv1 = new Television("Sony", "X80J",50, "1080p",
                "HD", 2021);
        Television tv2 = new Television("TCL", "32S335",32, "720p",
                "HD", 2019);
        Television tv3 = new Television("LG", "UP7070",70, "4K Ultra",
                "4K HD", 2021);

    }
}
