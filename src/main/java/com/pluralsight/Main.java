package com.pluralsight;

/**
 * Main (Workbook 5a, Section 1-2 Simple Inheritance, Exercise 2)
 *
 * Creates one object of each vehicle type, sets some values with the
 * setters, then tests the methods and the getters.
 *
 * None of the classes has a constructor yet, so every object is created
 * with empty parentheses and filled in afterwards with setters. A value
 * that is never set keeps its default: 0 for an int, null for a String.
 * The last line of the output shows that for the moped.
 */
public class Main {
    public static void main(String[] args) {
        // Question from the exercise: why can we call the Vehicle getters and
        // setters when we never created an instance of the Vehicle class?
        //
        // Because Moped extends Vehicle. A child class inherits the public
        // members of its parent, so setColor() and setFuelCapacity() are part
        // of every Moped even though they are written only once, in Vehicle.
        // "new Moped()" builds ONE object that holds the Vehicle part (color,
        // fuelCapacity, ...) and the Moped part (maxWeight) together.
        // A Moped IS a Vehicle, so no separate Vehicle object is needed
        Moped slowRide = new Moped("", "Red", 40, 100, 2, 0, 250);

        SemiTruck semiTruck = new SemiTruck("", "", 90, 100, 8, 80, 2);

        Hovercraft hovercraft = new Hovercraft("", "Blue", 95, 80, 4, 0, 50);

        Car car = new Car("", "", 200, 40, 5, 0, 4);

        // Test the functionality of the classes and methods
        // Each of these methods exists only in its own child class:
        // slowRide.hover() or car.ride() would not compile
        slowRide.ride();
        semiTruck.loadCargo();
        hovercraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        // getColor(), getFuelCapacity() and getTopSpeed() come from Vehicle,
        // getAirCushionPressure() is Hovercraft's own getter
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the Hovercraft: " + hovercraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());

        // Printing an object calls its toString() method automatically.
        // Moped has its own toString(), so we get a readable line with every
        // value. Only color and fuelCapacity were set, the rest show defaults
        System.out.println(slowRide);
    }
}