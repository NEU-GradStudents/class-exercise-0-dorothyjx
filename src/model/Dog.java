package model;

public class Dog {
    String name;
    String breed;
    String color;
    String gender;
    int age;
    String eyecolor;
    double weight;
    boolean insurancestatus;

    public Dog(String breed, String name, String color, boolean insuranceS) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.insurancestatus = insuranceS;
        System.out.println("Dog: " + name);
    }

    public String toString() {
        if(insurancestatus == true) {
            return "Dog color: " + color + ", breed: " + breed + ", name: " + name + " has Insurance.";
        } else {
            return "Dog color: " + color + ", breed: " + breed + ", name: " + name + " does not have Insurance";
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}