public class Vehicle {
    // Attributes for Vehicle
    private String brand;
    private String model;
    private double pricePerDay;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price per Day: $" + pricePerDay);
    }

    // Method to calculate discounted rental cost
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double totalCost = days * pricePerDay;
        double discountAmount = totalCost * (discountPercentage / 100);
        return totalCost - discountAmount;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Truck object and test the discount functionality
        Truck myTruck = new Truck("Ford", "F-150", 100.0);

        // Test for different rental durations
        int days1 = 2;
        int days2 = 4;
        double discount = 10.0;

        System.out.println("\n--- Rental for " + days1 + " days ---");
        System.out.println("Cost without extra discount: $" + myTruck.calculateDiscountedRentalCost(days1, discount));

        System.out.println("\n--- Rental for " + days2 + " days ---");
        System.out.println("Cost with extra discount: $" + myTruck.calculateDiscountedRentalCost(days2, discount));
    }
}
