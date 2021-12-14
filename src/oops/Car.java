package oops;

public class Car {

    //There are 4 types of object-oriented concepts in Java
    /*
    1. Inheritance
    2. Encapsulation
    3. Polymorphism
    4. Abstraction
     */

    String make = "Chevrolet";
    String model = "Corvette";
    String color = "Blue";
    int year = 2020;
    double price = 50000.00;

    public void drive() {
        System.out.println("This car run fast!");
    }

    public void brakes() {
        System.out.println("The car stopped when the light is red");
    }

}
