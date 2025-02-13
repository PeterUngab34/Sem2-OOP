/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hi
 */
public class ElectricCar extends Vehicle {
    // Unique attribute for ElectricCar
    private double batteryCapacity;

    // Constructor that calls the superclass constructor and initializes batteryCapacity
    public ElectricCar(String brand, String model, double pricePerDay, double batteryCapacity) {
        super(brand, model, pricePerDay);
        this.batteryCapacity = batteryCapacity;
    }

    // Override displayDetails() to include batteryCapacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Additional Method: Display battery info
    public void displayBatteryInfo() {
        System.out.println("This electric car has a battery capacity of " + batteryCapacity + " kWh.");
    }
}
