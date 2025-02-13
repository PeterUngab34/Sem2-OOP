/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hi
 */
public class Truck extends Vehicle {

    // Constructor for Truck that calls the superclass constructor
    public Truck(String brand, String model, double pricePerDay) {
        super(brand, model, pricePerDay);
    }

    // Override the calculateDiscountedRentalCost method to add extra discount for long rentals
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double totalCost = days * super.calculateDiscountedRentalCost(1, 0); // Get base cost

        // Apply standard discount
        double discountAmount = totalCost * (discountPercentage / 100);
        double discountedCost = totalCost - discountAmount;

        // Check for extra discount if rental period exceeds 3 days
        if (days > 3) {
            double extraDiscount = discountedCost * 0.05;
            discountedCost -= extraDiscount;
            System.out.println("Extra 5% discount applied for renting more than 3 days.");
        }

        return discountedCost;
    }
}
